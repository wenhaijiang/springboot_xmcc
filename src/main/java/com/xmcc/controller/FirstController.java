package com.xmcc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")

@Slf4j
public class FirstController {


    @GetMapping("/hello")
    public String hello(){

        log.info("hello logback slf4j");

        return "hello Spring boot";
    }
}
