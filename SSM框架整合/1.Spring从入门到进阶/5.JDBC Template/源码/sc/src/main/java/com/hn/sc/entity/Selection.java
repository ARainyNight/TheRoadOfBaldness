package com.hn.sc.entity;

import java.util.Date;

/***
 *  ClassName : Selection
 *  Author    : lin
 *  Date      : 2018/11/12 19:40    
 *  Remark    : 选课表实体类
 */

public class Selection {
    private int sid ;
    private int cid ;
    private Date selTime;
    private int score ;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getSelTime() {
        return selTime;
    }

    public void setSelTime(Date selTime) {
        this.selTime = selTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
