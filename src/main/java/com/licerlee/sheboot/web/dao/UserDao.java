package com.licerlee.sheboot.web.dao;

import java.util.List;

import com.licerlee.sheboot.common.dao.CommonDao;
import com.licerlee.sheboot.web.domain.User;

public interface UserDao extends CommonDao<User, String> {

	List<User> findByNameAndPasswd(String name, String passwd);

}
