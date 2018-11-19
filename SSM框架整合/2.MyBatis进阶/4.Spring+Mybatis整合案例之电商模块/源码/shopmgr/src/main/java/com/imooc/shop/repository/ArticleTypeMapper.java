package com.imooc.shop.repository;

import com.imooc.shop.bean.ArticleType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ArticleTypeMapper 数据访问类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2018-11-19 09:41:26
 * @version 1.0
 */
public interface ArticleTypeMapper {

    @Select("select * from ec_article_type")
    List<ArticleType> getArticleTypes();
}