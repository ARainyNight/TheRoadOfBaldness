package com.imooc.shop.repository;

import com.imooc.shop.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper 数据访问类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2018-11-19 09:41:26
 * @version 1.0
 */
public interface UserMapper {

    @Select("select * from ec_user where login_name=#{loginName}")
    User login(String loginName);
}