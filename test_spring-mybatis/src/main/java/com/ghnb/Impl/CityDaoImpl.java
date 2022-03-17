package com.ghnb.Impl;

import com.ghnb.dao.CityMapper;
import com.ghnb.pojo.City;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class CityDaoImpl implements CityMapper {

    //现在sqlSession不用我们自己创建了，交给spring管理;注意spring中SqlSessionTemplate其实就是sqlSession
    //把sqlSession作为一个peoperty属性定在在Impl业务中，再注入到spring中
    //要设置set方法！！ 进行注入！交由spring管理、创建对象；
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<City> selectCity() {
        CityMapper mapper = sqlSessionTemplate.getMapper(CityMapper.class);
        return mapper.selectCity();
    }


}
