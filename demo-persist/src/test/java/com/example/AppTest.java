package com.example;

import com.example.demo.persist.DemoPersistApplication;
import io.seata.common.util.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@Slf4j
@SpringBootTest(classes = DemoPersistApplication.class)
public class AppTest {

    @Autowired
    private IdWorker idWorker;

    @org.junit.jupiter.api.Test
    public void id() {
        for (int i = 0; i < 100; i++) {
            this.log.info(String.valueOf(idWorker.nextId()));
        }
    }

}
