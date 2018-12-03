/*
 * Copyright(c) 2015 zhph.com All rights reserved.
 * distributed with this file and available online at
 * http://www.zhph.com/
 */
package com.rong.app.boot.everyday.service.impl;

import com.rong.app.boot.everyday.entity.EveryDayEntity;
import com.rong.app.boot.everyday.dao.EveryDayMapper;
import com.rong.app.boot.everyday.service.IEveryDayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* EveryDay
 *
 * @author RONGDADA
 * @version v1.0
 * @CreationTime: - 2018-08-30 10:27:47
 * @Description:
 */
@Service
public class EveryDayServiceImpl implements IEveryDayService {

	@Resource
	private EveryDayMapper everyDayMapper;

	/**
	 * 获取EveryDay分页数据
	 * @param everyDayEntity
	 * @return 记录影响行数
	 */
	@Override
	public EveryDayEntity getEveryDayList(EveryDayEntity everyDayEntity) throws Exception {
        return everyDayEntity;
	}

	/**
	 * 获取EveryDay数据
	 * @param everyDay
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<EveryDayEntity> getPage(EveryDayEntity everyDay) throws Exception {
		return this.everyDayMapper.getList(everyDay);
	}

	/**
	 * EveryDay修改
	 * @param everyDay
	 * @return 记录影响行数
	 */
	@Override
	public int update(EveryDayEntity everyDay) throws Exception {
		return this.everyDayMapper.update(everyDay);

	}

	/**
	 * EveryDay添加
	 * @param everyDay
	 * @return 记录影响行数
	 */
	@Override
	public int insert(EveryDayEntity everyDay) throws Exception {
		return this.everyDayMapper.insert(everyDay);
	};

	/**
	 * EveryDay删除
	 * @param everyDay
	 * @return 记录影响行数
	 */
	@Override
	public int delete(EveryDayEntity everyDay) throws Exception {
		return this.everyDayMapper.delete(everyDay);
	}
}
