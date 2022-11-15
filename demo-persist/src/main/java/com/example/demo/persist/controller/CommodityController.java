package com.example.demo.persist.controller;

import com.example.demo.common.feign.CommodityFeign;
import com.example.demo.persist.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/commodity")
@RestController
public class CommodityController implements CommodityFeign {

    @Autowired
    private CommodityService service;

    @Override
    public void save() {
        this.service.save();
    }

}
