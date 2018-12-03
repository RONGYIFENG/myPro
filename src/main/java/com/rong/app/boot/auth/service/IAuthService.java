/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.auth.service;

import com.rong.app.boot.auth.entity.AuthEntity;

/**
* Auth
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 16:02:30
 * @Description:
 */
public interface IAuthService {



	/**
	 * Auth修改
	 * @param auth
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int update(AuthEntity auth) throws Exception;

	/**
	 * Auth添加
	 * @param auth
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int insert(AuthEntity auth) throws Exception;

	/**
	 * Auth删除
	 * @param auth
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int delete(AuthEntity auth) throws Exception;
}
