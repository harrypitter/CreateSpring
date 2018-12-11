package com.praticespring.mvc.action;

import com.praticespring.annotation.Autowried;
import com.praticespring.annotation.Controller;
import com.praticespring.annotation.RequestMapping;
import com.praticespring.mvc.service.IDemoService;

@Controller
public class MyAction {

    @Autowried
    IDemoService demoService;

    @RequestMapping("/index.html")
    public void query(){

    }

}

