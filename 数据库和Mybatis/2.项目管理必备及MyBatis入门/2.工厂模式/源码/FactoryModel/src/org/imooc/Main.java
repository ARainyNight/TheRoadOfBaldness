package org.imooc;

import org.imooc.plant.PlantNameConstant;

/***
 *  ClassName : Main
 *  Author    : lin
 *  Date      : 2018/10/9 16:24    
 *  Remark    : 
 */

public class Main {
    public static void main(String []args) throws Exception {
       Function function = new Function();
       function.put(PlantNameConstant.BEAN_NAME,8);
       function.put(PlantNameConstant.ICE_NAME,1);
       function.put(PlantNameConstant.WALL_NAME,2);
    }
}
