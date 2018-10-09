package org.imooc.factory;

import org.imooc.plant.*;

/***
 *  ClassName : SimpleFactory
 *  Author    : lin
 *  Date      : 2018/10/9 16:30    
 *  Remark    : 
 */

public class SimpleFactory {
    public static Plant createPlant(String name){
        Plant plant = null;
        if (PlantNameConstant.BEAN_NAME.equals(name)) {
            plant = new Bean();
        } else if (PlantNameConstant.ICE_NAME.equals(name)) {
            plant = new Ice();
        } else if (PlantNameConstant.WALL_NAME.equals(name)) {
            plant = new Wall();
        };

        return plant;
    }

    public static Plant createPlantByClassName(String name) throws Exception {
       return (Plant)Class.forName(name).newInstance();
    }
}
