package com.example.demo.temp.controller;

import com.example.demo.common.feign.TempFeign;
import com.example.demo.temp.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/temp")
@RestController
public class TempController implements TempFeign {

    @Autowired
    private TempService service;

    @Override
    public void save() {
        this.service.save();
    }

}
