package com.licerlee.sheboot.web.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.licerlee.sheboot.common.domain.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="sys_user")
public class User extends BaseEntity {

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String passwd;

	@Column(nullable = true)
	private String realName;

	@Column
	private Integer userStatus;
	
	@Column
	private Integer userType;
	
	// 使用@ManyToOne 不能和@Column同用
//	@Column
	@ManyToOne(cascade = { CascadeType.ALL }) // 关联role
	@JoinColumn(name="role_id") // join一个字段作为外键
	private Role role;
	
	@Column
	private String profile;
}
