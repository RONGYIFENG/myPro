/*
 * Copyright(c) 2018 liveeasy.tech All rights reserved.
 * distributed with this file and available online at
 * http://www.liveeasy.tech/
 */
package com.rong.app.boot.role.entity;

import java.io.Serializable;
import java.util.Date;

/**
* Role
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 15:55:57
 * @Description:
 */
public class RoleEntity implements Serializable {

    //@Length(max=32)
    /** 主键 */
    private String id;

    //@NotBlank @Length(max=32)
    /** 角色名 */
    private String roleName;

    //@NotNull @Max(127)
    /** 数据范围 */
    private Integer dataScope;

    //@Max(127)
    /** 删除标记 */
    private Integer delFlag;

    // start-处理日期参数查询条件
    // end-处理日期参数查询条件
        
    public void setId(String value) {
        this.id = value;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setRoleName(String value) {
        this.roleName = value;
    }
    
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setDataScope(Integer value) {
        this.dataScope = value;
    }
    
    public Integer getDataScope() {
        return this.dataScope;
    }
    
    public void setDelFlag(Integer value) {
        this.delFlag = value;
    }
    
    public Integer getDelFlag() {
        return this.delFlag;
    }
    


}
