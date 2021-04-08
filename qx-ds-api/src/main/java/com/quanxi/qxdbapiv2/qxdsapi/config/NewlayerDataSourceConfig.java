package com.quanxi.qxdbapiv2.qxdsapi.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.quanxi.qxdbapiv2.qxdsdao.dao.newlayer", sqlSessionTemplateRef = "newlayerSqlSessionTemplate")
public class NewlayerDataSourceConfig {
    @Bean(name = "newlayerDataSource")
    @Qualifier("newlayerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.newlayer")
    public DataSource newlayerDataSource() {
        return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
    }

    @Bean(name = "newlayerSqlSessionFactory")
    public SqlSessionFactory newlayerSqlSessionFactory(@Qualifier("newlayerDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/newlayer/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "newlayerTransactionManager")
    public DataSourceTransactionManager newlayerTransactionManager(@Qualifier("newlayerDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "newlayerSqlSessionTemplate")
    public SqlSessionTemplate newlayerSqlSessionTemplate(@Qualifier("newlayerSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
