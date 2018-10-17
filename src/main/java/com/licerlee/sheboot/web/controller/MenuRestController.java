package com.licerlee.sheboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.licerlee.sheboot.web.domain.Menu;
import com.licerlee.sheboot.web.service.MenuService;

import lombok.extern.slf4j.Slf4j;

@Slf4j // 使用lombok注解实现logging，直接使用log
@RestController
@RequestMapping("/menus")
public class MenuRestController {

	@Autowired
	public MenuService service;

	/**
	 * 处理"/users/"的GET请求，用来获取用户列表
	 * 
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	// @Cacheable(value="user-list-key")
	public List<Menu> getMenuList(Model model) {

		List<Menu> r = service.findAll();
		log.debug("Menu list ==> {}", r);

		return r;
	}

	/**
	 * 处理"/users/"的POST请求，用来创建User
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postMenu(@ModelAttribute Menu entity) {
		service.save(entity);
		return "success";
	}

	/**
	 * 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Menu findById(@PathVariable String id) {
		Menu u = service.find(id);
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
	public String putById(@PathVariable String id, @ModelAttribute Menu entity) {
		entity.setId(id);
		service.update(entity, id);
		return "success";
	}

	/**
	 * 处理"/users/{id}"的DELETE请求，用来删除User
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteById(@PathVariable String id) {
		service.delete(id);
		return "success";
	}

}
