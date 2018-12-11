package com.praticespring.mvc.service;

import com.praticespring.annotation.Service;

@Service
public class DemoService implements IDemoService {

    public String get(String name) {
        return "My name is " + name;
    }

}

