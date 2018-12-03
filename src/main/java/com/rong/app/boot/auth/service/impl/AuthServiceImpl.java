/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.auth.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.rong.app.boot.auth.dao.AuthMapper;
import com.rong.app.boot.auth.entity.AuthEntity;
import com.rong.app.boot.auth.service.IAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
* Auth
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 16:02:30
 * @Description:
 */
@Service("authService")
public class AuthServiceImpl implements IAuthService {
	private static Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);

	@Resource
	private AuthMapper authMapper;

	/**
	 * Auth修改
	 * @param auth
	 * @return 记录影响行数
	 */
	@Override
	public int update(AuthEntity auth) throws Exception {
		logger.info("修改Auth数据！");
		return this.authMapper.update(auth);

	}

	/**
	 * Auth添加
	 * @param auth
	 * @return 记录影响行数
	 */
	@Override
	public int insert(AuthEntity auth) throws Exception {
		logger.info("添加Auth数据！");
		return this.authMapper.insert(auth);
	}

	/**
	 * Auth删除
	 * @param auth
	 * @return 记录影响行数
	 */
	@Override
	public int delete(AuthEntity auth) throws Exception {
		logger.info("删除Auth数据！");
		return this.authMapper.delete(auth);
	}
}
