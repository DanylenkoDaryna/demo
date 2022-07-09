package com.azure.demo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('APPROLE_APPROLE.ADMIN', 'APPROLE_Daryna.write')")
    public String hello(){
        return  "Hello World!";
    }
}
