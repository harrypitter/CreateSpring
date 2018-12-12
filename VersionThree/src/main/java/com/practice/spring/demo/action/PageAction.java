package com.practice.spring.demo.action;

import java.util.HashMap;
import java.util.Map;

import com.practice.spring.demo.service.IQueryService;
import com.practice.spring.formework.annotation.Autowired;
import com.practice.spring.formework.annotation.Controller;
import com.practice.spring.formework.annotation.RequestMapping;
import com.practice.spring.formework.annotation.RequestParam;
import com.practice.spring.formework.webmvc.ModelAndView;

/**
 * 公布接口url
 * @author Tom
 *
 */
@Controller
@RequestMapping("/")
public class PageAction {

	@Autowired
    IQueryService queryService;
	
	@RequestMapping("/first.html")
	public ModelAndView query(@RequestParam("teacher") String teacher){
		String result = queryService.query(teacher);
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("teacher", teacher);
		model.put("data", result);
		model.put("token", "123456");
		return new ModelAndView("first.html",model);
	}
	
}
