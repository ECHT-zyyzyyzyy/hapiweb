package com.hapiweb.test_block;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hapiweb.test_block.resource.mapper")
public class TestBlockApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestBlockApplication.class, args);
    }

}
