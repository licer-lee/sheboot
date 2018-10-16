package com.licerlee.sheboot.common.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@MappedSuperclass
@Data
public class MysqlSequenceIdentityEntity extends IdEntity {

	@Id
	@Column(length = 36, nullable = false)
	@GenericGenerator(name = "sys_uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator = "sys_uuid")
	protected String id;

}
