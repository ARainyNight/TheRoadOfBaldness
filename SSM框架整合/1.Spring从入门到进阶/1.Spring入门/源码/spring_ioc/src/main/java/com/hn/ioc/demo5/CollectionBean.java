package com.hn.ioc.demo5;

import java.util.*;

/***
 *  ClassName : CollectionBean
 *  Author    : lin
 *  Date      : 2018/11/9 17:37    
 *  Remark    : 
 */

public class CollectionBean {
    private String[] ars ;//数组类型

    private List<String> list ;//List集合类型

    private Set<String > set ;//Set集合类型

    private Map<String ,Integer> map;//map集合类型

    private Properties properties ; //属性类型

    public String[] getArs() {
        return ars;
    }

    public void setArs(String[] ars) {
        this.ars = ars;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "ars=" + Arrays.toString(ars) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
