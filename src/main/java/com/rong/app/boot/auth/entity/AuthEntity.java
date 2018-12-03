/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.auth.entity;

import java.io.Serializable;
import java.util.Date;

/**
* Auth
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 16:02:30
 * @Description:
 */
public class AuthEntity implements Serializable {

    //@Length(max=32)
    /** 权限主键 */
    private String id;

    //@NotBlank @Length(max=32)
    /** 权限名称 */
    private String authName;

    //@NotBlank @Length(max=32)
    /** 权限编号 */
    private String authCode;

    //@Length(max=32)
    /** 权限请求的url */
    private String authUrl;

    //@Length(max=32)
    /** 权限标识 */
    private String authPermission;

    //
    /** 权限类型 */
    private Integer authType;

    // start-处理日期参数查询条件
    // end-处理日期参数查询条件
        
    public void setId(String value) {
        this.id = value;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setAuthName(String value) {
        this.authName = value;
    }
    
    public String getAuthName() {
        return this.authName;
    }
    
    public void setAuthCode(String value) {
        this.authCode = value;
    }
    
    public String getAuthCode() {
        return this.authCode;
    }
    
    public void setAuthUrl(String value) {
        this.authUrl = value;
    }
    
    public String getAuthUrl() {
        return this.authUrl;
    }
    
    public void setAuthPermission(String value) {
        this.authPermission = value;
    }
    
    public String getAuthPermission() {
        return this.authPermission;
    }
    
    public void setAuthType(Integer value) {
        this.authType = value;
    }
    
    public Integer getAuthType() {
        return this.authType;
    }
    


}
