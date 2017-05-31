package flyweight;

import flyweight.Soldier;

/**
 * SoldierImp
 */
public class SoldierImp implements Soldier {

    /**
     * 享元具体实现类中维护的内部状态
     * 士兵的形状（图形展示）
     * 如何展示士兵取决于享元的具体实现
     */
    private Object soldierGraphicalRepresentation;

    /**
     * 注意，此方法接收士兵的坐标作为参数
     * 士兵的坐标是外部状态，不会有对旧坐标的引用； 否则新坐标就得在享元实现里边维护了
     */
    public void moveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY){
        // 将士兵在旧坐标的展示删除， 然后在新坐标渲染士兵的图形展示
    }
}