package com.licerlee.sheboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.licerlee.sheboot.common.service.AbstractCommonService;
import com.licerlee.sheboot.web.dao.UserDao;
import com.licerlee.sheboot.web.domain.User;

@Service
// @Component // Component包含service
public class UserService extends AbstractCommonService<User, String> {

	
	@Autowired
	private UserDao userDao;

	// 通过动态代理得到userDaoImpl对象
	// set注入UserDao实现
	@Autowired
	public void setUserDao(UserDao userDao) {
		super.setCommonDao(userDao);
	}

	
	public List<User> findByNameAndPasswd(String name, String passwd){
		return userDao.findByNameAndPasswd(name, passwd);
	}
}
