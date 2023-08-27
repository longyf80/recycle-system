package com.product.recycle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.product.recycle.mapper")
public class RecycleSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecycleSystemApplication.class, args);
    }

}
