package com.hn.sc.dao;

import com.hn.sc.entity.Selection;

import java.util.List;
import java.util.Map;

/***
 *  ClassName : SelectionDao
 *  Author    : lin
 *  Date      : 2018/11/12 19:59    
 *  Remark    : 
 */

public interface SelectionDao {

    public void insert(List<Selection> seles);

    public void delete(int sid,int cid);

    public List<Map<String,Object>> selectByStudent(int sid);

    public List<Map<String,Object>> selectByCourse(int cid);
}
