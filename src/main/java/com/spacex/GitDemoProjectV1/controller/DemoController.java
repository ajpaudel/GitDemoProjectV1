package com.spacex.GitDemoProjectV1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spacex.GitDemoProjectV1.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
    DemoService demoService;

    @GetMapping(value = "/get")
    public ResponseEntity<String> get() {
        return demoService.get();
    }

    @PutMapping(value = "/put")
    public ResponseEntity<String> put(){
        return demoService.put();
    }

    @PostMapping(value ="/post")
    public ResponseEntity<String> post(){
        return demoService.post("");
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<String> delete() {
        return demoService.delete("");
    }

}
