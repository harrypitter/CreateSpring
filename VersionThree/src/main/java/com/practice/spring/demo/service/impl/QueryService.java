package com.practice.spring.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.practice.spring.demo.service.IQueryService;
import com.practice.spring.formework.annotation.Service;

/**
 * 查询业务
 * @author Tom
 *
 */
@Service
public class QueryService implements IQueryService {

	/**
	 * 查询
	 */
	public String query(String name) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		String json = "{name:\"" + name + "\",time:\"" + time + "\"}";
		return json;
	}

}
