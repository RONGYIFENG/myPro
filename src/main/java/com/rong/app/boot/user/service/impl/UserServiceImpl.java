/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.user.service.impl;

import javax.annotation.Resource;

import com.rong.app.boot.user.dao.UserMapper;
import com.rong.app.boot.user.entity.UserEntity;
import com.rong.app.boot.user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
/**
* User
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 14:48:37
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Resource
	private UserMapper userMapper;


	/**
	 * User修改
	 * @param user
	 * @return 记录影响行数
	 */
	@Override
	public int update(UserEntity user) throws Exception {
		logger.info("修改User数据！");
		return this.userMapper.update(user);

	}

	/**
	 * User添加
	 * @param user
	 * @return 记录影响行数
	 */
	@Override
	public int insert(UserEntity user) throws Exception {
		logger.info("添加User数据！");
		return this.userMapper.insert(user);
	};

	/**
	 * User删除
	 * @param user
	 * @return 记录影响行数
	 */
	@Override
	public int delete(UserEntity user) throws Exception {
		logger.info("删除User数据！");
		return this.userMapper.delete(user);
	};
}
