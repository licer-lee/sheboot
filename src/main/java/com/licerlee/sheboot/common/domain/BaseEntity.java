package com.licerlee.sheboot.common.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

/**
 * 定义实体的基础公共属性，所有实体都会继承.
 * 
 * @author liwc
 * @date 2018年10月16日 下午3:35:34
 */
@MappedSuperclass
@Data
public class BaseEntity extends MysqlSequenceIdentityEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4008064786763625272L;

	// 逻辑删除标识位—已删除状态
	public static final String DELETE_FLAG_DELETED = "1";

	// 逻辑删除标识位—未删除状态
	public static final String DELETE_FLAG_NORMAL = "0";

	// 审核状态标识位—未审核
	public static final String AUDIT_FLAG_NOT = "0";

	// 审核状态标识位—审核通过
	public static final String AUDIT_FLAG_PASS = "1";

	// 审核状态标识位—审核通不过
	public static final String AUDIT_FLAG_FAIL = "2";

	/**
	 * 创建日期
	 */
	@Column(updatable = false)
	protected Date createDate;
	/**
	 * 修改日期
	 */
	@Column(nullable = true)
	protected Date updateDate;

	/**
	 * 删除标志(0-正常，1-删除)
	 * 
	 * @return
	 */
	@Column(length = 1)
	protected String deleteFlag;

	/**
	 * 审核状态(0-未审核，1-审核通过，2-审核不通过)
	 * 
	 * @return
	 */
	@Column(length = 2)
	protected String auditFlag;

	
	@PrePersist
	public void prePersist() {
		if (this.createDate == null) {
			this.setCreateDate(new Date());
		}
		this.setUpdateDate(new Date());
		if (StringUtils.isBlank(this.getDeleteFlag())) {
			this.setDeleteFlag(BaseEntity.DELETE_FLAG_NORMAL);
		}
	}

	@PreUpdate
	public void preUpdate() {
		this.setUpdateDate(new Date());
	}
}
