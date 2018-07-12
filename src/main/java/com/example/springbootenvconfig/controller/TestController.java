package com.example.springbootenvconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shihongwei
 * @Created: 0:03 2018/7/13
 * @Modified
 * @Description:
 */
@RestController
public class TestController {

    @Value("${test.key}")
    private String key;
    @Value("${test}")
    private String test;

    @GetMapping("get")
    public String getKey() {
        return key + test;
    }
}
