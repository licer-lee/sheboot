package com.licerlee.sheboot.web.domain;

import com.licerlee.sheboot.common.domain.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task //extends BaseEntity
{
	
	private Long id;
	private String taskname;
}
