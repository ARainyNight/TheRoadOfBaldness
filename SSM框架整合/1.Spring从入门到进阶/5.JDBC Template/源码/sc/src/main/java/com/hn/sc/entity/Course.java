package com.hn.sc.entity;

/***
 *  ClassName : Course
 *  Author    : lin
 *  Date      : 2018/11/12 19:39    
 *  Remark    : 课程表实体类
 */

public class Course {
    private int id ;
    private String name;
    private int score ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
