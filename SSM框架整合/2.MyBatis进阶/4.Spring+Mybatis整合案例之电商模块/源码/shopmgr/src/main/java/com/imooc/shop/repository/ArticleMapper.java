package com.imooc.shop.repository;

import com.imooc.shop.bean.Article;
import com.imooc.shop.utils.Pager;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ArticleMapper 数据访问类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2018-11-19 09:41:26
 * @version 1.0
 */
public interface ArticleMapper {

    List<Article> searchArticles(@Param("typeCode") String typeCode,
                                 @Param("secondType") String secondTyp,
                                 @Param("title") String title,
                                 @Param("pager") Pager pager);

    int count(@Param("typeCode") String typeCode,
              @Param("secondType") String secondTyp,
              @Param("title") String title);

    @Delete("delete from ec_article where id = #{id}")
    void deleteById(@Param("id") String id);

    @Select("select * from ec_article where id = #{id}")
    @ResultMap("articleResultMap")
    Article getArticleById(@Param("id") String id);
}