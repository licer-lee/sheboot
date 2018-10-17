package com.licerlee.sheboot.web.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.licerlee.sheboot.common.domain.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="sys_role")
public class Role extends BaseEntity {

	@Column(length=128, nullable = false)
	private String roleName;

	@Column(nullable = true)
	private String roleDesc;

	@Column(nullable = true)
	@ManyToMany
	private Set<Menu> menus;

	
}
