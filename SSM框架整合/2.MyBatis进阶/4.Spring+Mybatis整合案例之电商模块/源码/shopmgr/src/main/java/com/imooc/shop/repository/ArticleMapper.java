package com.imooc.shop.repository;

import com.imooc.shop.bean.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ArticleMapper 数据访问类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2018-11-19 09:41:26
 * @version 1.0
 */
public interface ArticleMapper {

    List<Article> searchArticles(@Param("typeCode") String typeCode,@Param("secondType") String secondTyp,
                                 @Param("title") String title);
}