package com.dev.geunsnsadvanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GeunSnsAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeunSnsAdvancedApplication.class, args);
    }

}
