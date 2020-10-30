package com.gs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.gs.mapper")
@EnableCaching //开启缓存
public class Sb5Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb5Application.class, args);
    }

}
