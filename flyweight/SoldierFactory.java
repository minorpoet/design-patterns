package flyweight;

import flyweight.Soldier;
import flyweight.SoldierImp;

/**
 * Flyweight Factory
 */
public class SoldierFactory {
        /**
         * 享元对象池， 这个例子只有一种类型的士兵 就直接用单一实例了，
         * 如果有多种类型的士兵， 可以使用Array，List或者HashMap来存储
         */
       private static Soldier SOLDIER;

       public static Soldier getSoldier(){
           if(SOLDIER == null){
               synchronized(SSoldierFactory.class){
                   if(SOLDIER == null){
                        SOLDIER = new SoldierImp();
               }
           }
           return SOLDIER;
       }
}