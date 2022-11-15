package com.example.demo.common.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Validated
@FeignClient(value = "demo-persist", path = "/persist/commodity")
public interface CommodityFeign {

    @PostMapping("/save")
    void save();
}
