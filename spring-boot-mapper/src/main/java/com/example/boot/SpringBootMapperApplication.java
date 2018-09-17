package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.boot.module")
public class SpringBootMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMapperApplication.class, args);
    }
}
