package com.codefirstio.codefirsthelloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")

public class DemoTask {
    @GetMapping
    public String HelloW(){
        return "Hello World";
    }
}
