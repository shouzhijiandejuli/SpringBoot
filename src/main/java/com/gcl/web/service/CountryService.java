package com.gcl.web.service;

import java.util.List;

import com.gcl.web.entity.Country;

public interface CountryService {
    /**
     * 
     * @Title: getAll 
     * @Description: 获取城市列表
     * @author: guoconglin
     * @param country
     * @return
     * @date: 2017年5月16日 上午11:33:07 
     * @return: List<Country>
     */
    public List<Country> getAll(Country country);
    /**
     * 
     * @Title: getById 
     * @Description: 通过Id获取信息
     * @author: guoconglin
     * @param id
     * @return
     * @date: 2017年5月16日 上午11:34:16 
     * @return: Country
     */
    public Country getById(Integer id);
    /**
     * 
     * @Title: deleteById 
     * @Description: 删除
     * @author: guoconglin
     * @param id
     * @date: 2017年5月16日 上午11:34:30 
     * @return: void
     */
    public void deleteById(Integer id);
    /**
     * 
     * @Title: save 
     * @Description: 保存
     * @author: guoconglin
     * @param country
     * @date: 2017年5月16日 上午11:34:39 
     * @return: void
     */
    public void save(Country country);
}
