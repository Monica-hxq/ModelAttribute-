package com.shengda.hxq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.shengda.hxq.mapper")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
