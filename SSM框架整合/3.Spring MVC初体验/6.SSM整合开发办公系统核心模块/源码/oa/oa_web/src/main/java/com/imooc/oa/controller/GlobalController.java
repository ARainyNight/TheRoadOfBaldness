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

    /**
     * 退出登录
     *
     * @param session
     * @return
     */
    @RequestMapping("/quit")
    public String quit(HttpSession session) {
        session.setAttribute("employee", null);
        return "redirect:to_login";
    }

    /**
     * 去修改密码
     *
     * @return
     */
    @RequestMapping("/to_change_password")
    public String toChangePassword() {
        return "change_password";
    }

    /**
     * 修改密码
     *
     * @param session
     * @param old
     * @param new1
     * @param new2
     * @return
     */
    @RequestMapping("/change_password")
    public String changePassword(HttpSession session, @RequestParam String old, @RequestParam String new1, @RequestParam String new2) {
        Employee employee = (Employee) session.getAttribute("employee");
        if (employee.getPassword().equals(old)) {
            if (new1.equals(new2)) {
                employee.setPassword(new1);
                globalBiz.changePassword(employee);
                return "redirect:self";
            }
        }
        return "redirect:to_change_password";
    }


}
