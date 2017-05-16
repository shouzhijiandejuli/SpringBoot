package com.gcl.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcl.web.dao.CityMapper;
import com.gcl.web.entity.City;
import com.gcl.web.service.CityService;
import com.github.pagehelper.PageHelper;
@Service
public class CityServiceImpl implements CityService {

    @Autowired(required = true)
    CityMapper cityMapper;
    @Override
    public List<City> getAll(City city) {
       if(city.getPage() != null && city.getRows() != null){
           PageHelper.startPage(city.getPage(),city.getRows(),"id");
       }
        return cityMapper.selectAll();
    }

    @Override
    public City getById(Integer id) {
       
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {
       cityMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void save(City city) {
        if(city.getId() == null){
            cityMapper.insert(city);
        }else{
            cityMapper.updateByPrimaryKey(city);
        }
       

    }

}
