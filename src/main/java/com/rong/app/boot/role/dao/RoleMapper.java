/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.role.dao;


import com.rong.app.boot.role.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* Role
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 15:55:57
 * @Description:
 */
@Mapper
public interface RoleMapper  {
	/**
	 * Role修改
	 * @param role
	 * @return 记录影响行数
	 */
	int update(RoleEntity role);

	/**
	 * Role添加
	 * @param role
	 * @return 记录影响行数
	 */
	int insert(RoleEntity role);

	/**
	 * Role删除
	 * @param role
	 * @return 记录影响行数
	 */
	int delete(RoleEntity role);

}