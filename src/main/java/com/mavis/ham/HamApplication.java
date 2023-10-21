package com.mavis.ham;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.mavis.ham.mapper")
@SpringBootApplication
public class HamApplication {

    public static void main(String[] args) {
        SpringApplication.run(HamApplication.class, args);
    }

}
