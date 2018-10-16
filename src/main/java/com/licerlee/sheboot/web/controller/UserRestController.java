package com.licerlee.sheboot.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.licerlee.sheboot.web.domain.User;
import com.licerlee.sheboot.web.service.UserService;

/**
 * Users restful api 标题：基于RBAC的基础权限框架demo 功能： 描述：
 * 
 * @author liwc
 * @date 2018年8月20日 上午10:23:38 @ UserController
 */
@RestController
@RequestMapping("/users")
public class UserRestController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	public UserService userService;

	/**
	 * 处理"/users/"的GET请求，用来获取用户列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> getUserList(Model model) {

		List<User> r = userService.findAll();
		logger.info(""+ r);
		return r;
	}

	/**
	 * 处理"/users/"的POST请求，用来创建User
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postUser(@ModelAttribute User user) {
		userService.save(user);
		return "success";
	}

	/**
	 * 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable String id) {
		User u = userService.find(id);
		return u;
	}

	/**
	 * 处理"/users/{id}"的PUT请求，用来更新User信息
	 * 
	 * @param id
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public String putUser(@PathVariable String id, @ModelAttribute User user) {
		user.setId(id);
		userService.update(user, id);
		return "success";
	}

	/**
	 * 处理"/users/{id}"的DELETE请求，用来删除User
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable String id) {
		userService.delete(id);
		return "success";
	}
	
	@RequestMapping(value="/user", method= RequestMethod.POST)
	public List<User> findByNameAndPasswd(@RequestParam String name, @RequestParam String passwd){
		List<User> user = userService.findByNameAndPasswd(name, passwd);
		return user;
	}
}
