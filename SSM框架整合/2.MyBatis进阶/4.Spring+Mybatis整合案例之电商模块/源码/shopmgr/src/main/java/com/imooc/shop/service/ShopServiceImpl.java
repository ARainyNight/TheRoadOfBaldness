package com.imooc.shop.service;

import com.imooc.shop.bean.ArticleType;
import com.imooc.shop.bean.User;
import com.imooc.shop.repository.ArticleTypeMapper;
import com.imooc.shop.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 *  ClassName : ShopServiceImpl
 *  Author    : lin
 *  Date      : 2018/11/19 10:22    
 *  Remark    : 
 */

@Service("shopService")
public class ShopServiceImpl implements ShopService {

    //得到数据访问层对象
    @Resource
    private ArticleTypeMapper articleTypeMapper ;

    @Resource
    private UserMapper userMapper ;


    @Override
    public List<ArticleType> getArticleTypes() {
        return articleTypeMapper.getArticleTypes();
    }

    @Override
    public Map<String, Object> login(String loginName, String passWord) {
        Map<String,Object> results = new HashMap<>();
        // 1.判断参数是否为空的
        if(StringUtils.isEmpty(loginName) || StringUtils.isEmpty(passWord)){
            // 参数为空了
            results.put("code",1);
            results.put("msg","参数为空了");
        }else{
            // 根据登陆名称去查询用户对象
            User user =userMapper.login(loginName);
            if(user !=null){
                // 判断密码
                if(user.getPassword().equals(passWord)){
                    // 登陆成功了
                    // 应该将登陆成功的用户存入到Session会话中
                    results.put("code",0);
                    results.put("msg",user);
                }else{
                    // 密码错误了
                    results.put("code",2);
                    results.put("msg","密码错误了");
                }
            }else{
                // 登陆名不存在
                results.put("code",3);
                results.put("msg","登陆名不存在");
            }

        }
        return results;
    }
}
