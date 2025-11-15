package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/hello")
    public String home(){
        return "Hello, World!";
    }
    // 테스트
    //대충 바꾸는ㄱ 내용
}
