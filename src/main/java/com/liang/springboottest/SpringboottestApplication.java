package com.liang.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.liang.springboottest.polo")
public class SpringboottestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringboottestApplication.class, args);
    }

}
