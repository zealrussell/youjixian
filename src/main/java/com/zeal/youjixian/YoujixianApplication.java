package com.zeal.youjixian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zeal.youjixian.mapper")
public class YoujixianApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoujixianApplication.class, args);
    }

}
