package com.ghnb.service;

import com.ghnb.pojo.City;

import java.util.List;

public interface CityService {
    int addCity(City city);
    //删除一个城市by id
    int deleteCityById(int id);
    //更新City信息
    int updateCity(City city);
    //查询City by id
    City queryCityById(int id);
    //查询所有City
    List<City> queryAllCity();
}
