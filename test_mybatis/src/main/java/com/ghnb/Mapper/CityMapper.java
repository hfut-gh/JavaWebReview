package com.ghnb.Mapper;

import java.util.List;
import com.ghnb.pojo.City;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CityMapper {
    List<City> selectCity();
//    如果使用注解进行开发就不需要对应的mapper.xml文件了

    List<String> selectCityNameByCode(@Param("cc")String countryCode);

    @Select("select * from city where CountryCode=#{code}")
    List<City> selectCityByCode(@Param("code")String countryCode);
}
