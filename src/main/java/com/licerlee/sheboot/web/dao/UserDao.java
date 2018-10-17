package com.licerlee.sheboot.web.dao;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.licerlee.sheboot.common.dao.CommonDao;
import com.licerlee.sheboot.web.domain.User;

// 继承通用dao+自定义dao
public interface UserDao extends CommonDao<User, String>, UserDaoCustom
//, QueryDslPredicateExecutor<User> 

{

	// List<User> findByNameAndPasswd(String name, String passwd);

}
