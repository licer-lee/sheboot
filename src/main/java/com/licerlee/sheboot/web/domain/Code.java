package com.licerlee.sheboot.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.licerlee.sheboot.common.domain.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="sys_code")
public class Code extends BaseEntity {

	@Column(length=128, nullable = false)
	private String classId;

	@Column(nullable = true)
	private String className;

	@Column(nullable = true)
	private String item;
	
	@Column(nullable = true)
	private String itemValue;
	
}
