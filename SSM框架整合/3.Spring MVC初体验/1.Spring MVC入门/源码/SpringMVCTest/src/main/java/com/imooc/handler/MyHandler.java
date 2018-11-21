package com.imooc.handler;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/***
 *  ClassName : com.imooc.handler.MyHandler
 *  Author    : lin
 *  Date      : 2018/11/21 20:55    
 *  Remark    : 
 */

public class MyHandler implements Controller {

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {


        //装载模型数据和逻辑视图
        ModelAndView modelAndView = new ModelAndView();
        //添加模型数据
        modelAndView.addObject("name","Xiaoluo");
        //添加逻辑视图
        modelAndView.setViewName("show");

        return modelAndView;
    }

}
