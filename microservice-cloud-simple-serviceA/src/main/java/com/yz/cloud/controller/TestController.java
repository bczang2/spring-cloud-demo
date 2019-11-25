package com.yz.cloud.controller;

import com.yz.cloud.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping(value = "/get")
    public String test(){
        return testService.test();
    }
}
