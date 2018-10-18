package com.licerlee.sheboot.web.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.licerlee.sheboot.common.domain.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="sys_menu")
public class Menu extends BaseEntity {

	@Column(length=128, nullable = false)
	private String menuName;

	@Column(nullable = true)
	private String menuUrl;
	
	@Column(nullable = true)
	private Integer menuLevel;
	
	@Column(nullable = true)
	private String menuType;
	
	@Column(nullable = true)
	private String menuIcon;
	
//	@Column(nullable = true)
//	private String parent;
	
	@Column(nullable = true)
	@OneToMany
	private Set<Menu> child;

}
