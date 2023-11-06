package com.inn.cafe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(path="/user")
public class UserController {

    public ResponseEntity<String> signUp(@RequestBody(required = true) Map<String,String> requestMap){
        return null;
    }

}
