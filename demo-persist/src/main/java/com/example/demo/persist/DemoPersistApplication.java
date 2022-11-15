package com.example.demo.persist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@ComponentScan({
        "com.example.demo.persist",
        "com.example.demo.common"
})
@MapperScan("com.example.demo.persist.dao")
@SpringBootApplication
public class DemoPersistApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoPersistApplication.class, args);
    }
}
