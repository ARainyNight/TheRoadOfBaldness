package hn.jdbc.service;

import hn.jdbc.bean.User;
import hn.jdbc.dao.UserDAO;

/***
 *  ClassName : UserService
 *  Author    : lin
 *  Date      : 2018/10/5 22:22    
 *  Remark    : 用户Service
 */

public class UserService {

    private UserDAO userDAO ;

    public UserService(){
        userDAO=new UserDAO();
    }

    public User login(String username , String password){
        return userDAO.login(username,password);
    }
}
