package com.praticespring.mvc.action;

import com.praticespring.annotation.Autowried;
import com.praticespring.annotation.Controller;
import com.praticespring.annotation.RequestMapping;
import com.praticespring.annotation.RequestParam;
import com.praticespring.mvc.service.IDemoService;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/demo")
public class DemoAction {

    @Autowried
    private IDemoService demoService;

    @RequestMapping("/query.json")
    public void query(HttpServletRequest req,HttpServletResponse resp,
                      @RequestParam("name") String name){
        String result = demoService.get(name);
        System.out.println(result);
//		try {
//			resp.getWriter().write(result);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    }

    @RequestMapping("/edit.json")
    public void edit(HttpServletRequest req,HttpServletResponse resp,Integer id){

    }

}
