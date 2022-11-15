package com.example.demo.persist.service;

import com.example.demo.persist.dao.CommodityMapper;
import com.example.demo.persist.entity.Commodity;
import io.seata.common.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Autowired
    private IdWorker idWorker;

    @Transactional(rollbackFor = Exception.class)
    public void save() {
        Commodity commodity1 = new Commodity();
        commodity1.setId(this.idWorker.nextId());
        commodity1.setName("张三");
        commodity1.setPrice(BigDecimal.valueOf(17.77));
        commodity1.setStock(77777);

        Commodity commodity2 = new Commodity();
        commodity2.setId(this.idWorker.nextId());
        commodity2.setName("李四");
        commodity2.setPrice(BigDecimal.valueOf(17.77));
        commodity2.setStock(77777);

        this.commodityMapper.insert(commodity1);
        int x = 1 / 0;
        this.commodityMapper.insert(commodity2);
    }
}
