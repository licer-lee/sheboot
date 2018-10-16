package com.licerlee.sheboot.common.domain;

import javax.persistence.MappedSuperclass;

/**
 * 统一定义实体的ID抽象类
 * @author liwc
 * @date 2018年10月16日 下午3:29:19
 */
// @MappedSuperclass不是一个完整的实体类，他将不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中。
@MappedSuperclass
public class IdEntity{

}
