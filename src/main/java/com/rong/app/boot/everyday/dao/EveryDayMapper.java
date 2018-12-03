/*
 * Copyright(c) 2015 zhph.com All rights reserved.
 * distributed with this file and available online at
 * http://www.zhph.com/
 */
package com.rong.app.boot.everyday.dao;

import java.util.List;
import com.rong.app.boot.everyday.entity.EveryDayEntity;
import org.apache.ibatis.annotations.Mapper;
/**
* EveryDay
 *
 * @author RONGDADA
 * @version v1.0
 * @CreationTime: - 2018-08-30 10:27:47
 * @Description:
 */
@Mapper
public interface EveryDayMapper {

	/**
	 * 获取EveryDay分页数据
	 * @param everyDay
	 * @param everyDay
	 * @return
	 */
	List<EveryDayEntity> getListForEveryDay(EveryDayEntity everyDay);

	/**
	 * 获取EveryDay数据
	 * @param everyDay
	 * @return
	 */
	List<EveryDayEntity> getList(EveryDayEntity everyDay);

	/**
	 * 获取EveryDay分页数据
	 * @param everyDay
	 * @return
	 */
	int getCountForEveryDay(EveryDayEntity everyDay);

	/**
	 * EveryDay修改
	 * @param everyDay
	 * @return 记录影响行数
	 */
	int update(EveryDayEntity everyDay);

	/**
	 * EveryDay添加
	 * @param everyDay
	 * @return 记录影响行数
	 */
	int insert(EveryDayEntity everyDay);

	/**
	 * EveryDay删除
	 * @param everyDay
	 * @return 记录影响行数
	 */
	int delete(EveryDayEntity everyDay);

}