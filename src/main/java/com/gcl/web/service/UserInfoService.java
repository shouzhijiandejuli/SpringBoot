package com.gcl.web.service;

import java.util.List;

import com.gcl.web.entity.UserInfo;
/**
 * 
 * @ClassName: UserInfoService 
 * @Description: TODO
 * @author: guoconglin
 * @date: 2017年5月16日 上午11:29:54
 */
public interface UserInfoService {

    /**
     * 
     * @Title: getAll 
     * @Description: 获取用户列表
     * @author: guoconglin
     * @param UserInfo
     * @return
     * @date: 2017年5月16日 上午11:30:01 
     * @return: List<UserInfo>
     */
    public List<UserInfo> getAll(UserInfo userInfo);
    /**
     * 
     * @Title: getById 
     * @Description: 通过Id获取用户信息
     * @author: guoconglin
     * @param id
     * @return
     * @date: 2017年5月16日 上午11:30:24 
     * @return: UserInfo
     */
    public UserInfo getById(Integer id);
    /**
     * 
     * @Title: deleteById 
     * @Description: 通过id删除用户
     * @author: guoconglin
     * @param id
     * @date: 2017年5月16日 上午11:30:42 
     * @return: void
     */
    public void deleteById(Integer id);
    /**
     * 
     * @Title: save 
     * @Description: 保存用户
     * @author: guoconglin
     * @param country
     * @date: 2017年5月16日 上午11:31:16 
     * @return: void
     */
    public void save(UserInfo userInfo);
}
