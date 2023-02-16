package com.parisa.example.controller;

import com.parisa.example.model.MyDomain;
import com.parisa.example.service.myDomain.MyDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/domain")
public class MyDomainController {
    @Autowired
    MyDomainService myDomainService;

    @GetMapping("find/{id}")
    public MyDomain find(@PathVariable Long id) {
        return myDomainService.findById(id).get();
    }
}
