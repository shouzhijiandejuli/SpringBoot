package com.gcl.web.dao;

import com.gcl.web.entity.City;
import com.gcl.web.util.MyMapper;
/**
 * 
 * @ClassName: CityMapper 
 * @Description: TODO
 * @author: guoconglin
 * @date: 2017年5月16日 上午10:59:50
 */
public interface CityMapper extends MyMapper<City>{
    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}