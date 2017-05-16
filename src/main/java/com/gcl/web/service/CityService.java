package com.gcl.web.service;

import java.util.List;

import com.gcl.web.entity.City;
public interface CityService {
    /**
     * 
     * @Title: getAll 
     * @Description: 获取省\市列表
     * @author: guoconglin
     * @param city
     * @return
     * @date: 2017年5月16日 上午11:31:31 
     * @return: List<City>
     */
    public List<City> getAll(City city);
    /**
     * 
     * @Title: getById 
     * @Description:通过id获取信息
     * @author: guoconglin
     * @param id
     * @return
     * @date: 2017年5月16日 上午11:31:52 
     * @return: City
     */
    public City getById(Integer id);
    /**
     * 
     * @Title: deleteById 
     * @Description: 删除
     * @author: guoconglin
     * @param id
     * @date: 2017年5月16日 上午11:32:43 
     * @return: void
     */
    public void deleteById(Integer id);
    /**
     * 
     * @Title: save 
     * @Description: 保存
     * @author: guoconglin
     * @param city
     * @date: 2017年5月16日 上午11:32:50 
     * @return: void
     */
    public void save(City city);
}
