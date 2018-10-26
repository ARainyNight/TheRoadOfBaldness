package com.imooc.cake.service;

import com.imooc.cake.common.MyBatisUtils;
import com.imooc.cake.entity.Category;
import com.imooc.cake.mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/***
 *  ClassName : CategoryService
 *  Author    : lin
 *  Date      : 2018/10/26 16:59    
 *  Remark    : 分类
 */

public class CategoryService {

    public List<Category> getCateegories(){
        SqlSession sqlSession = MyBatisUtils.openSession();
        try {
            CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
            return mapper.getCategories();
        }finally {
            sqlSession.close();
        }
    }
}
