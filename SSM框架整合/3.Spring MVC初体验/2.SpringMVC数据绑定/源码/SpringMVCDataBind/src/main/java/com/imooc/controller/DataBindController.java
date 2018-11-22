package com.imooc.controller;

import com.imooc.dao.CourseDao;
import com.imooc.entity.Course;
import com.imooc.entity.CourseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/***
 *  ClassName : DataBindController
 *  Author    : lin
 *  Date      : 2018/11/22 10:13    
 *  Remark    : 
 */

@Controller
public class DataBindController {

    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value = "/baseType")
    @ResponseBody
    public String baseType(@RequestParam(value = "id") int id){
        return "id:"+id;
    }


    @RequestMapping(value = "/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "id") Integer id){
        return "id:"+ id ;
    }


    @RequestMapping(value = "/arrayType")
    @ResponseBody
    public String arrayType(String[] name){
          StringBuffer sbf = new StringBuffer();
        for (String item:
             name) {
            sbf.append(item).append(" ");
        }
        return sbf.toString();
    }


    @RequestMapping(value = "pojoType")
    public ModelAndView pojoType(Course course){
        courseDao.add(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject(courseDao.getAll());

        return modelAndView ;
    }

    @RequestMapping(value = "listType")
    public ModelAndView listType(CourseList courseList){
        for (Course course:
             courseList.getCourses()) {
            courseDao.add(course);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject(courseDao.getAll());
        return modelAndView;
    }

}
