package com.hn.datastructure.linetable;

/***
 *  ClassName : ArrayList
 *  Author    : lin
 *  Date      : 2018/11/28 22:22    
 *  Remark    : 顺序表
 *  底层采用的数组，长度可以动态变化
 */

public class ArrayList implements List {

    private Object[] elementData;  //底层是一个数组,目前还没有确定长度

    private int size ; //不是数组分配了几个空间，而是元素的个数


    public ArrayList(){
        //没有指定长度，默认长度是4
       this(4);
       //没有指定长度，长度是0
//        elementData = new Object[]{};
    }

    /**
     *
     * @param initialCapacity 指定数组的初始长度
     */
    public ArrayList(int initialCapacity){
        //给数组分配指定数据的空间
        elementData = new Object[initialCapacity];
        //指定顺序表的元素个数，默认是0
        size = 0 ;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {

    }

    @Override
    public void add(Object e) {

    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }
}
