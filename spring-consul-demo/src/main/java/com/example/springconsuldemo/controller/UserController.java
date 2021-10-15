package com.example.springconsuldemo.controller;

import com.example.springconsuldemo.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(value = MyConfig.class)
public class UserController {

    @Autowired
    private MyConfig config;

    @GetMapping("/getAll")
    public MyConfig getConfig(){

        return config;
    }
}
