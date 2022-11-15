package com.example.demo.temp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@ComponentScan({
        "com.example.demo.temp",
        "com.example.demo.common"
})
@MapperScan("com.example.demo.temp.mapper")
@SpringBootApplication
public class DemoTempApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoTempApplication.class, args);
    }
}
