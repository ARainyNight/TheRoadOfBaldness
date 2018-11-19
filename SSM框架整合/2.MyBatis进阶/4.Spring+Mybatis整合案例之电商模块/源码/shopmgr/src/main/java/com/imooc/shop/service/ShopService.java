package com.imooc.shop.service;

import com.imooc.shop.bean.ArticleType;

import java.util.List;
import java.util.Map;

public interface ShopService {
    List<ArticleType> getArticleTypes();

    Map<String, Object> login(String loginName, String password);
}