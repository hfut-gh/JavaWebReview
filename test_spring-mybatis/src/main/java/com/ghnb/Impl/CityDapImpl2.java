package com.ghnb.Impl;

//spring-mybatis整合方式2，利用Spring中的SqlSessionDaoSurpport
//dao继承Support类 , 直接利用 getSqlSession() 获得 , 然后直接注入SqlSessionFactory .
// 比起方式1 , 不需要管理SqlSessionTemplate , 而且对事务的支持更加友好 .

import com.ghnb.dao.CityMapper;
import com.ghnb.pojo.City;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class CityDapImpl2 extends SqlSessionDaoSupport implements CityMapper {
    @Override
    public List<City> selectCity() {
        CityMapper mapper = getSqlSession().getMapper(CityMapper.class);
        return mapper.selectCity();
    }
}
