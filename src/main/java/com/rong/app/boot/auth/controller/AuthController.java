/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.auth.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rong.app.boot.auth.entity.AuthEntity;
import com.rong.app.boot.auth.service.IAuthService;
import com.rong.app.boot.utils.RestfulResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
* Auth
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 16:02:30
 * @Description:
 */
@Controller
@RequestMapping("/admin/ops/auth/auth")
public class AuthController {
	private static Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Resource
	private IAuthService authService;
	
	/**
     * 显示Auth列表页面
     */
    @RequestMapping("/index")
    public String bankInfoList(HttpServletRequest request,
                               HttpServletResponse response){
        return "/ops/auth/auth/view";
    }


    /**
     * 插入Auth数据
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public RestfulResult insert(HttpServletRequest request,
                                  HttpServletResponse response,
                                  @RequestBody AuthEntity authEntity) throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("添加成功");
        authService.insert(authEntity);
        return result;
    }

    /**
     * 修改Auth数据
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public RestfulResult update(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody AuthEntity authEntity) throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("修改成功");
        authService.update(authEntity);
        return result;
    }

    /**
     * 删除Auth数据
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public RestfulResult delete(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody AuthEntity authEntity)  throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("删除成功");
        authService.delete(authEntity);
        return result;
    }




}
