package com.gcl.web.entity;

import java.io.Serializable;

import javax.persistence.*;
/**
 * 
 * @ClassName: BaseEntity 
 * @Description: 公用分页实体类
 * @author: guoconglin
 * @date: 2017年5月16日 上午11:09:59
 */
public class BaseEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
    
    
}
