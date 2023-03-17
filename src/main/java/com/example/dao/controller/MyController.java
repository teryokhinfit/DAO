package com.example.dao.controller;

import com.example.dao.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    MyService service;


    @GetMapping("/product/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name){
        return service.getProductName(name);
    }

}
