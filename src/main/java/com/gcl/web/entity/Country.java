package com.gcl.web.entity;

import java.io.Serializable;
/**
 * 
 * @ClassName: Country 
 * @Description: TODO
 * @author: guoconglin
 * @date: 2017年5月16日 上午11:09:27
 */
public class Country extends BaseEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String countryname;

    private String countrycode;
    
   /* @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
    
}