package com.example.xianyuserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.xianyuserver.dao")
public class XianyuServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(XianyuServerApplication.class, args);
    }
}

