package com.licerlee.sheboot.common.service;

import java.io.Serializable;
import java.util.List;

import com.licerlee.sheboot.common.dao.CommonDao;

// 通过组合方式持有 dao对象引用
// 只提供公共访问能力
public abstract class AbstractCommonService<E, ID extends Serializable> {

	
	protected CommonDao<E, ID> commonDao;

	public CommonDao<E, ID> getCommonDao() {
		return commonDao;
	}
	// 注入commonDao接口实现
	public void setCommonDao(CommonDao<E, ID> commonDao) {
		this.commonDao = commonDao;
	}

	
	public E get(ID id) {
		return commonDao.getOne(id);
	}

	public E find(ID id) {
		return commonDao.findOne(id);
	}

	public List<E> findAll() {
		return commonDao.findAll();
	}

	public void save(E e) {
		commonDao.save(e);
	}

	public void delete(ID id) {
		commonDao.delete(id);
	}

	public long count() {
		return commonDao.count();
	}
}
