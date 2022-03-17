package com.ghnb.service;

import com.ghnb.dao.CityMapper;
import com.ghnb.pojo.City;

import java.util.List;

public class CityServiceImpl implements CityService{

    private CityMapper cityMapper;

    public void setCityMapper(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public int addCity(City city) {
        return cityMapper.addCity(city);
    }

    @Override
    public int deleteCityById(int id) {
        return cityMapper.deleteCityById(id);
    }

    @Override
    public int updateCity(City city) {
        return cityMapper.updateCity(city);
    }

    @Override
    public City queryCityById(int id) {
        return cityMapper.queryCityById(id);
    }

    @Override
    public List<City> queryAllCity() {
        return cityMapper.queryAllCity();
    }
}
