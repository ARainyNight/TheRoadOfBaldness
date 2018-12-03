package com.imooc.oa.controller;

import com.imooc.oa.biz.GlobalBiz;
import com.imooc.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/***
 *  ClassName : GlobalController
 *  Author    : lin
 *  Date      : 2018/12/3 17:08    
 *  Remark    : 
 */

@Controller("globalController")
public class GlobalController {

    @Autowired
    private GlobalBiz globalBiz;

    /**
     * 去登录
     *
     * @return
     */
    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    /**
     * 登录
     *
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn, @RequestParam String password) {
        Employee employee = globalBiz.login(sn, password);
        if (employee == null) {
            return "redirect:to_login";
        }
        session.setAttribute("employee", employee);
        return "redirect:self";
    }

    /**
     * 跳转查看个人信息
     *
     * @return
     */
    @RequestMapping("/self")
    public String self() {
        return "self";
    }


}
