package com.seaman.demo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Demo10Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo10Application.class, args);
    }

}

