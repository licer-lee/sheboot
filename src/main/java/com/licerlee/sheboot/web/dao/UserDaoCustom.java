package com.licerlee.sheboot.web.dao;

import java.util.List;

import com.licerlee.sheboot.web.domain.User;

/**
 * User自定义dao接口
 * @author liwc
 * @date 2018年10月17日 下午5:17:17
 */
public interface UserDaoCustom {

	List<User> findByNameAndPasswd(String name, String passwd);

}
