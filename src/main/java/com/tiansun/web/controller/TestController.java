package com.tiansun.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @date 2021/6/25 14:57
 * @description
 */
@RestController
public class TestController {
    @GetMapping("hi")
    public String sayHello(){
        return "say hello!!!";
    }
}
