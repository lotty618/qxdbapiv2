package com.quanxi.qxdbapiv2.qxdsdaq.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.quanxi.qxdbapiv2.qxdsdao.dao.original", sqlSessionTemplateRef = "originalSqlSessionTemplate")
public class OriginalDataSourceConfig {
    @Value("${mybatis.configuration.default-fetch-size}")
    private int defaultFetchSize;

    @Bean(name = "originalDataSource")
    @Qualifier("originalDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.original")
    public DataSource originalDataSource() {
        return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
    }

    @Bean(name = "originalSqlSessionFactory")
    @Primary
    public SqlSessionFactory originalSqlSessionFactory(@Qualifier("originalDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/original/*.xml"));

        org.apache.ibatis.session.Configuration cfg = new org.apache.ibatis.session.Configuration();
        cfg.setDefaultFetchSize(defaultFetchSize);
        bean.setConfiguration(cfg);

        return bean.getObject();
    }

    @Bean(name = "originalTransactionManager")
    @Primary
    public DataSourceTransactionManager originalTransactionManager(@Qualifier("originalDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "originalSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate originalSqlSessionTemplate(@Qualifier("originalSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
