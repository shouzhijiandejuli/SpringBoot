package com.gcl.web.entity;

import java.io.Serializable;
/**
 * 
 * @ClassName: UserInfo 
 * @Description: 用户实体类
 * @author: guoconglin
 * @date: 2017年5月16日 上午11:08:28
 */
public class UserInfo extends BaseEntity implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;

    private String username;

    private String password;

    private String usertype;

    private Integer enabled;

    private String realname;

    private String qq;

    private String email;

    private String tel;
    
    /*@Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}