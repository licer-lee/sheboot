package com.licerlee.sheboot.common.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.util.Assert;

import com.licerlee.sheboot.common.dao.CommonDao;
import com.licerlee.sheboot.common.domain.BaseEntity;

// 通过组合方式持有 dao对象引用
// 只提供公共访问能力
public abstract class AbstractCommonService<E extends BaseEntity, ID extends Serializable> {

	private static final String ID_MUST_NOT_BE_NULL = "Id must not be null";
	
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
	
	public void update(E e, ID id) {
		if(!commonDao.exists(id)){
			Assert.notNull(e.getId(), ID_MUST_NOT_BE_NULL);
		}
		commonDao.save(e);
	}

	public void delete(ID id) {
		commonDao.delete(id);
	}

	public long count() {
		return commonDao.count();
	}
}
