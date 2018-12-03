/*
 * Copyright(c) 2015 zhph.com All rights reserved.
 * distributed with this file and available online at
 * http://www.zhph.com/
 */
package com.rong.app.boot.everyday.entity;

import java.io.Serializable;

/**
* EveryDay
 *
 * @author RONGDADA
 * @version v1.0
 * @CreationTime: - 2018-08-30 10:27:47
 * @Description:
 */
public class EveryDayEntity implements Serializable {

    //@Length(max=32)
    /** 主键 */
    private String id;
    /** 标题 */
    private String title;

    //@NotNull 
    /** 类型 */
    private Integer type;

    //@Length(max=0)
    /** 作者 */
    private String author;

    //@NotBlank @Length(max=2500)
    /** 内容 */
    private String content;

    //@NotNull 
    /** 发布时间 */
    private Long createTime;

    //@Length(max=0)
    /** 图片 */
    private String img;

    // start-处理日期参数查询条件
    // end-处理日期参数查询条件
        
    public void setId(String value) {
        this.id = value;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setType(Integer value) {
        this.type = value;
    }
    
    public Integer getType() {
        return this.type;
    }
    
    public void setAuthor(String value) {
        this.author = value;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setContent(String value) {
        this.content = value;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setCreateTime(Long value) {
        this.createTime = value;
    }
    
    public Long getCreateTime() {
        return this.createTime;
    }
    
    public void setImg(String value) {
        this.img = value;
    }
    
    public String getImg() {
        return this.img;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
