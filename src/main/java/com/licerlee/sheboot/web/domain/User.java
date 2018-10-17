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
@Entity(name="t_user")
public class User extends BaseEntity {

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String passwd;

	@Column(nullable = true)
	private Integer age;

}
