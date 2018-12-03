/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.auth.dao;


import com.rong.app.boot.auth.entity.AuthEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* Auth
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 16:02:30
 * @Description:
 */
@Mapper
public interface AuthMapper  {

	/**
	 * Auth修改
	 * @param auth
	 * @return 记录影响行数
	 */
	int update(AuthEntity auth);

	/**
	 * Auth添加
	 * @param auth
	 * @return 记录影响行数
	 */
	int insert(AuthEntity auth);

	/**
	 * Auth删除
	 * @param auth
	 * @return 记录影响行数
	 */
	int delete(AuthEntity auth);

}