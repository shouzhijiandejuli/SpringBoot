package com.gcl.web.dao;

import com.gcl.web.entity.Country;
import com.gcl.web.util.MyMapper;
/**
 * 
 * @ClassName: CountryMapper 
 * @Description: TODO
 * @author: guoconglin
 * @date: 2017年5月16日 上午11:00:14
 */
public interface CountryMapper extends MyMapper<Country> {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}