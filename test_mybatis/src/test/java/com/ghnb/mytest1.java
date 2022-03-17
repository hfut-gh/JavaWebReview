package com.ghnb;

import com.ghnb.Mapper.CityMapper;
import com.ghnb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class mytest1 {
    @Test
    public void test_Param(){
        SqlSession sqlSession = MybatisUtils.getSession();
        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<String> names=mapper.selectCityNameByCode("NLD");
        for (String name:names){
            System.out.println(name);
        }
        sqlSession.close();
    }
}
