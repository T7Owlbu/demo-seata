package com.example.demo.common.conf;

import io.seata.common.util.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnowflakeConf {

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(0L);
    }

}
