/*
 * Copyright(c) 2015 zhph.com All rights reserved.
 * distributed with this file and available online at
 * http://www.zhph.com/
 */
package com.rong.app.boot.everyday.service;

import java.util.List;
import com.rong.app.boot.everyday.entity.EveryDayEntity;

/**
* EveryDay
 *
 * @author RONGDADA
 * @version v1.0
 * @CreationTime: - 2018-08-30 10:27:47
 * @Description:
 */
public interface IEveryDayService {

	/**
	 * 获取EveryDay分页数据
	 * @param everyDay
	 * @return
	 * @throws Exception
	 * */
	EveryDayEntity getEveryDayList(EveryDayEntity everyDay) throws Exception;

	/**
	 * 获取EveryDay数据
	 * @param everyDay
	 * @return
	 * @throws Exception
	 * */
	List<EveryDayEntity> getPage(EveryDayEntity everyDay) throws Exception;


	/**
	 * EveryDay修改
	 * @param everyDay
	 * @return 记录影响行数
	 * @throws Exception
	 * 100 250 zi   500
	 */
	int update(EveryDayEntity everyDay) throws Exception;

	/**
	 * EveryDay添加
	 * @param everyDay
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int insert(EveryDayEntity everyDay) throws Exception;

	/**
	 * EveryDay删除
	 * @param everyDay
	 * @return 记录影响行数
	 * @throws Exception
	 */
	int delete(EveryDayEntity everyDay) throws Exception;
}
