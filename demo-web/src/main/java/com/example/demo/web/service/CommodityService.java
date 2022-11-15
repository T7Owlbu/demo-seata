package com.example.demo.web.service;

import com.example.demo.common.feign.CommodityFeign;
import com.example.demo.common.feign.TempFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityService {

    @Autowired
    private CommodityFeign commodityFeign;
    @Autowired
    private TempFeign tempFeign;

    @GlobalTransactional(rollbackFor = Exception.class)
    public void save() {
        this.tempFeign.save();
        this.commodityFeign.save();
    }
}
