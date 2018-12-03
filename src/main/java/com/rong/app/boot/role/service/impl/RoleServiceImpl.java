/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.role.service.impl;
import javax.annotation.Resource;

import com.rong.app.boot.role.dao.RoleMapper;
import com.rong.app.boot.role.entity.RoleEntity;
import com.rong.app.boot.role.service.IRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
* Role
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 15:55:57
 * @Description:
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
	private static Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Resource
	private RoleMapper roleMapper;

	/**
	 * Role修改
	 * @param role
	 * @return 记录影响行数
	 */
	@Override
	public int update(RoleEntity role) throws Exception {
		logger.info("修改Role数据！");
		return this.roleMapper.update(role);

	}

	/**
	 * Role添加
	 * @param role
	 * @return 记录影响行数
	 */
	@Override
	public int insert(RoleEntity role) throws Exception {
		logger.info("添加Role数据！");
		return this.roleMapper.insert(role);
	}

	/**
	 * Role删除
	 * @param role
	 * @return 记录影响行数
	 */
	@Override
	public int delete(RoleEntity role) throws Exception {
		logger.info("删除Role数据！");
		return this.roleMapper.delete(role);
	}
}
