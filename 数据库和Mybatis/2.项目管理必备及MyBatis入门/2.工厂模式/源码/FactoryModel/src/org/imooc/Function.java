package org.imooc;

import org.imooc.factory.SimpleFactory;
import org.imooc.plant.Bean;
import org.imooc.plant.Ice;
import org.imooc.plant.Plant;
import org.imooc.plant.Wall;

/***
 *  ClassName : Function
 *  Author    : lin
 *  Date      : 2018/10/9 16:08    
 *  Remark    : 
 */

public class Function {
    public void put(String name, int number) throws Exception {
        Plant plant = SimpleFactory.createPlantByClassName(name);


        System.out.println("将" + plant.getName() + "放在" + number + "号草地上");
        plant.fight();
    }
}
