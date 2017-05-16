package com.gcl.web.entity;
import java.io.Serializable;
/**
 * 
 * @ClassName: City 
 * @Description: TODO
 * @author: guoconglin
 * @date: 2017年5月16日 上午11:09:49
 */
public class City extends BaseEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;

    private String state;
    
  /*  @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    
}