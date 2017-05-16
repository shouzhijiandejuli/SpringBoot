package com.gcl.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcl.web.dao.CountryMapper;
import com.gcl.web.entity.Country;
import com.gcl.web.service.CountryService;
import com.github.pagehelper.PageHelper;
@Service
public class CountryServiceImpl implements CountryService {
    
    @Autowired
    CountryMapper countryMapper;

    @Override
    public List<Country> getAll(Country country) {
      if(country.getPage() != null && country.getRows() != null){
          PageHelper.startPage(country.getPage(), country.getRows(), "id");
      }
        return countryMapper.selectAll();
    }

    @Override
    public Country getById(Integer id) {
      
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {
      countryMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void save(Country country) {
       if(country.getId() != null){
           countryMapper.updateByPrimaryKey(country);
       }else{
           countryMapper.insert(country);
       }

    }

}
