/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.role.service;

import com.rong.app.boot.role.entity.RoleEntity;

/**
* Role
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 15:55:57
 * @Description:
 */
public interface IRoleService {
	/**
	 * Role修改
	 * @param role
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int update(RoleEntity role) throws Exception;

	/**
	 * Role添加
	 * @param role
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int insert(RoleEntity role) throws Exception;

	/**
	 * Role删除
	 * @param role
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int delete(RoleEntity role) throws Exception;
}
