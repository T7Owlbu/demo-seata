package com.example.demo.common.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Validated
@FeignClient(value = "demo-temp", path = "/temp/temp")
public interface TempFeign {

    @PostMapping("/save")
    void save();
}
