package com.example.demo.web.controller;

import com.example.demo.web.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RequestMapping("/commodity")
@RestController
public class CommodityController {

    @Autowired
    private CommodityService service;

    @PostMapping("/save")
    public void save() {
        this.service.save();
    }

}
