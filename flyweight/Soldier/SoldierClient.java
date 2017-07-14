package flyweight.soldier;

import flyweight.Soldier;
import flyweight.SoldierFactory;

/**
 * 这是个 “重量级“ 的士兵对象
 * 是士兵享元对象的消费方，此对象提供士兵所有的操作，并且是直接用于战争游戏中的
 */
public class SoldierClient{

    /**
     * 引用享元
     */
    private Soldier soldier = SoldierFactory.getSoldier();

    private int currentLocationX = 0;
    
    private int currentLocationY = 0;

    public void moveSoldier(int newLocationX, int newLocationY){
        
        // 实际的渲染是由士兵享元来处理的
        soldier.moveSoldier(previousLocationX, previousLocationY, newLocationX, newLocationY);

        currentLocationX = newLocationX;
        currentLocationY = newLocationY;
    }
}