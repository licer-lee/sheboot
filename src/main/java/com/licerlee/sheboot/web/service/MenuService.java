package com.licerlee.sheboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.licerlee.sheboot.common.service.AbstractCommonService;
import com.licerlee.sheboot.web.dao.MenuDao;
import com.licerlee.sheboot.web.domain.Menu;

@Service
// @Component // Component包含service
public class MenuService extends AbstractCommonService<Menu, String> {

	
	@Autowired
	private MenuDao dao;

	@Autowired
	public void setDao(MenuDao dao) {
		super.setCommonDao(dao);
	}
	
	

	
}
