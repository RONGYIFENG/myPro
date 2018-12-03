/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.auth.controller;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.langyi.comp.excel.service.ExportExcelService;
import tech.liveeasy.platform.common.plugs.code.DictCodeService;
import tech.liveeasy.platform.common.plugs.pagination.Page;
import tech.liveeasy.platform.common.plugs.pagination.RestfulResult;
import tech.liveeasy.platform.common.utils.CommonUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



import com.rong.app.auth.service.IAuthService;
import com.rong.app.auth.vo.AuthVo;
import com.rong.app.auth.entity.AuthEntity;

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

    @Autowired
    private DictCodeService dictCodeService;
	
	/**
     * 显示Auth列表页面
     */
    @RequestMapping("/index")
    public String bankInfoList(HttpServletRequest request,
                               HttpServletResponse response){
        dictCodeService.config(AuthEntity.class);
        request.setAttribute("dictJsonStr", dictCodeService.getJSONStr());
        return "/ops/auth/auth/view";
    }

    /**
     * 获取Auth列表数据
     */
    @RequestMapping("/pageList")
    @ResponseBody
    public RestfulResult pageList(@RequestBody Page<AuthEntity> page) throws Exception{
        RestfulResult<Page<AuthEntity>> result = new RestfulResult();
        page = authService.getAuthList(page);
        result.setSuccess(true);
        result.setMsg("查询成功");
        result.setData(page);
        return result;
    }

    /**
     * 导出Auth数据
     */
    @RequestMapping("/export")
    public void export(HttpServletRequest request, HttpServletResponse response,
                                @RequestBody(required=false) AuthEntity authEntity) throws Exception {
        ServletOutputStream out;
        List<AuthVo> queryResult;
        ExportExcelService service;
        Workbook workbook;
        Sheet sheet;

        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("Auth_"+System.currentTimeMillis()+".xls", "UTF-8"));
        response.setContentType("application/msexcel;charset=UTF-8");

        queryResult =  authService.getPage(authEntity);
        workbook = new HSSFWorkbook();
        sheet = workbook.createSheet("Auth");
        service = new ExportExcelService(queryResult, sheet, "Auth");
        //装配编码
        //service.addDic();
        service.doExport();
        //生成下拉数据和数据检测
        service.exportTemplate();

        out = response.getOutputStream();
        workbook.write(out);
        out.close();
        out.flush();
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
