package com.pusong.study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class Hello {
    @RequestMapping()
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
}
