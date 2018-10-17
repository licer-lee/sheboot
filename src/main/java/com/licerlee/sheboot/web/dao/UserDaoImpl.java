package com.licerlee.sheboot.web.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.licerlee.sheboot.web.domain.User;

// UserDaoImpl与UserDao在同一个包下时，可以不用显式实现dao接口，即可通过动态代理实现接口功能
public class UserDaoImpl implements UserDaoCustom {

	@Autowired
	private EntityManager em;

	public List<User> findByNameAndPasswd(String name, String passwd) {
		System.out.println("user login: name " + name + "passwd " + passwd);
		Query q = em.createQuery("from User where name=?1 and passwd=?2", User.class);
		q.setParameter(1, name);
		q.setParameter(2, passwd);

		return q.getResultList();
	}

}
