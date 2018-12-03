/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.user.service;

import com.rong.app.boot.user.entity.UserEntity;

/**
* User
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 14:48:37
 * @Description:
 */
public interface IUserService {


	/**
	 * User修改
	 * @param user
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int update(UserEntity user) throws Exception;

	/**
	 * User添加
	 * @param user
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int insert(UserEntity user) throws Exception;

	/**
	 * User删除
	 * @param user
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int delete(UserEntity user) throws Exception;
}
