package com.wtw.catfriendsServer.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<?> getTestUrl(){
        Map<String, String> json = new HashMap<>();
        json.put("success","test");

        return new ResponseEntity<>(json, HttpStatus.OK);
    }

    @PostMapping("/test")
    public ResponseEntity<?> postTestUrl(@RequestBody Map<String, String> req){
        Map<String, String> json = new HashMap<>();
        if(req.get("data") != null){
            json.put(req.get("data"), "success!");
        }else{
            json.put("no data", "fail!");
        }
        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
