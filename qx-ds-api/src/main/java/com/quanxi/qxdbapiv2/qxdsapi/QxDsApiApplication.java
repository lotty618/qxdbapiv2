package com.quanxi.qxdbapiv2.qxdsapi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class QxDsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(QxDsApiApplication.class, args);
    }

}
