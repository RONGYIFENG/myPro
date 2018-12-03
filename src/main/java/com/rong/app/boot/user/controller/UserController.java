/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.user.controller;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import com.rong.app.boot.user.entity.UserEntity;
import com.rong.app.boot.user.service.IUserService;
import com.rong.app.boot.utils.RestfulResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
* User
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 14:48:37
 * @Description:
 */
@Controller
@RequestMapping("/admin/ops/user/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource
	private IUserService userService;
	
	/**
     * 显示User列表页面
     */
    @RequestMapping("/index")
    public String bankInfoList(HttpServletRequest request,
                               HttpServletResponse response){
        return "/ops/user/user/view";
    }


    /**
     * 插入User数据
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public RestfulResult insert(HttpServletRequest request,
                                  HttpServletResponse response,
                                  @RequestBody UserEntity userEntity) throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("添加成功");
        userService.insert(userEntity);
        return result;
    }

    /**
     * 修改User数据
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public RestfulResult update(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody UserEntity userEntity) throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("修改成功");
        userService.update(userEntity);
        return result;
    }

    /**
     * 删除User数据
     */
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public RestfulResult delete(HttpServletRequest request,
                                HttpServletResponse response,
                                @RequestBody UserEntity userEntity)  throws Exception{
        RestfulResult result = new RestfulResult();
        result.setSuccess(true);
        result.setMsg("删除成功");
        userService.delete(userEntity);
        return result;
    }




}
