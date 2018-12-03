/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.role.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rong.app.boot.role.entity.RoleEntity;
import com.rong.app.boot.role.service.IRoleService;
import com.rong.app.boot.utils.RestfulResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**
* Role
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 15:55:57
 * @Description:
 */
@Controller
@RequestMapping("/admin/ops/role/role")
public class RoleController {
	private static Logger logger = LoggerFactory.getLogger(RoleController.class);

	@Resource
	private IRoleService roleService;


	/**
     * 显示Role列表页面
     */
    @RequestMapping("/index")
    public String bankInfoList(HttpServletRequest request,
                               HttpServletResponse response){
        return "/ops/role/role/view";
    }
    /**
     * 插入Role数据
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public RestfulResult insert(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody RoleEntity roleEntity) throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("添加成功");
        roleService.insert(roleEntity);
        return result;
    }

    /**
     * 修改Role数据
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public RestfulResult update(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody RoleEntity roleEntity) throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("修改成功");
        roleService.update(roleEntity);
        return result;
    }

    /**
     * 删除Role数据
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public RestfulResult delete(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody RoleEntity roleEntity)  throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("删除成功");
        roleService.delete(roleEntity);
        return result;
    }




}
