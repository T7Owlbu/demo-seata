package com.example.demo.temp.service;

import com.example.demo.temp.entity.Temp;
import com.example.demo.temp.mapper.TempMapper;
import io.seata.common.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TempService {

    @Autowired
    private TempMapper tempMapper;

    @Autowired
    private IdWorker idWorker;

    @Transactional(rollbackFor = Exception.class)
    public void save() {
        Temp temp = new Temp();
        temp.setId(this.idWorker.nextId());
        temp.setName("temp");
        this.tempMapper.insert(temp);
    }

}
