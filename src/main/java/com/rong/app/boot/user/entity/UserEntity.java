/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
* User
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 14:48:37
 * @Description:
 */
public class UserEntity implements Serializable {

    //@Length(max=32)
    /** id */
    private String id;

    //@Length(max=20)
    /** 姓名 */
    private String name;

    //@Max(127)
    /** 性别 */
    private Integer sex;

    //@Length(max=32)
    /** 登录名 */
    private String loginName;

    //@Length(max=32)
    /** 密码 */
    private String password;

    //@Max(127)
    /** 在职状态 */
    private Integer status;

    // start-处理日期参数查询条件
    // end-处理日期参数查询条件
        
    public void setId(String value) {
        this.id = value;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setName(String value) {
        this.name = value;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setSex(Integer value) {
        this.sex = value;
    }
    
    public Integer getSex() {
        return this.sex;
    }
    
    public void setLoginName(String value) {
        this.loginName = value;
    }
    
    public String getLoginName() {
        return this.loginName;
    }
    
    public void setPassword(String value) {
        this.password = value;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setStatus(Integer value) {
        this.status = value;
    }
    
    public Integer getStatus() {
        return this.status;
    }
    


}
