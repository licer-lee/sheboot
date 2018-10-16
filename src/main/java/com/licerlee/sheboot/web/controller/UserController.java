package com.licerlee.sheboot.web.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.licerlee.sheboot.web.service.UserService;

/**
 * Users restful api
 * 标题：基于RBAC的基础权限框架demo
 * 功能：
 * 描述：
 * @author liwc
 * @date 2018年8月20日 上午10:23:38
 * @ UserController
 */
@Controller
@RequestMapping("/user") 
public class UserController {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	public UserService us;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getUserList(Model model) {
		
		Map<String, Object> map = Collections.synchronizedMap(new HashMap<>());
		map.put("title", "sheboot");
		map.put("username", "liwc");
		map.put("age", 28);
		map.put("desc", "Java develope enginer");
		
		
		List<Map<String, Object>> projects = Collections.synchronizedList(new ArrayList<>());
		Map<String, Object> project = Collections.synchronizedMap(new HashMap<>());
		project.put("proName", "安景erp系统");
		project.put("tech", "struts2+mssql");
		project.put("role", "developer");
		projects.add(project);
		project = Collections.synchronizedMap(new HashMap<>());
		
		project.put("proName", "sheboot系统");
		project.put("tech", "springboot+Mysql");
		project.put("role", "project manager");
		projects.add(project);
		
		map.put("projects", projects);
		
		logger.info("map:" + map);
		model.addAllAttributes(map);
		return "user-list";
	}
}
