package com.gcl.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcl.web.dao.UserInfoMapper;
import com.gcl.web.entity.UserInfo;
import com.gcl.web.service.UserInfoService;
import com.github.pagehelper.PageHelper;
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getAll(UserInfo userInfo) {
       if(userInfo.getPage() != null && userInfo.getRows() != null){
           PageHelper.startPage(userInfo.getPage(), userInfo.getRows(), "id");
       }
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo getById(Integer id) {
       
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {
       userInfoMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void save(UserInfo userInfo) {
      if(userInfo.getId() != null){
          userInfoMapper.updateByPrimaryKey(userInfo);
      }else{
          userInfoMapper.insert(userInfo);
      }

    }

}
