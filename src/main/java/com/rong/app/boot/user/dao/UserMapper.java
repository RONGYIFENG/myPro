/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.user.dao;


import com.rong.app.boot.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
/**
* User
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 14:48:37
 * @Description:
 */
@Mapper
public interface UserMapper  {
	/**
	 * User修改
	 * @param user
	 * @return 记录影响行数
	 */
	int update(UserEntity user);

	/**
	 * User添加
	 * @param user
	 * @return 记录影响行数
	 */
	int insert(UserEntity user);

	/**
	 * User删除
	 * @param user
	 * @return 记录影响行数
	 */
	int delete(UserEntity user);

}