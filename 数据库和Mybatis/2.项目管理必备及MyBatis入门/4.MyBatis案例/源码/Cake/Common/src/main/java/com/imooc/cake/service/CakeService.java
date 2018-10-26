package com.imooc.cake.service;

import com.imooc.cake.common.MyBatisUtils;
import com.imooc.cake.entity.Cake;
import com.imooc.cake.mapper.CakeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/***
 *  ClassName : CakeService
 *  Author    : lin
 *  Date      : 2018/10/26 16:53    
 *  Remark    : 
 */

public class CakeService {

    public List<Cake> getCakesByCategoryId(Long categoryId, Integer page,Integer size){
        SqlSession sqlSession = MyBatisUtils.openSession();
        try {
            CakeMapper mapper = sqlSession.getMapper(CakeMapper.class);
            return mapper.getCakesByCategoryId(categoryId,(page-1)*size,size);
        } finally {
            sqlSession.close();
        }
    }
}
