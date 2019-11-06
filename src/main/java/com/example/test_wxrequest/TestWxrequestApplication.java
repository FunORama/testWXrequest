package com.example.test_wxrequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.test_wxrequest.mapper")
@SpringBootApplication
public class TestWxrequestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestWxrequestApplication.class, args);
    }

}
