package org.example.springboottop50annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching
@EnableTransactionManagement
public class SpringBootTop50AnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTop50AnnotationApplication.class, args);
    }

}
