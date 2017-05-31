package flyweight;

/**
 * Driver: War Game
 */
public class WarGame{
    public static void main(String[] args){
        // 开始战争

        // 绘制战地

        // 创建 5 个士兵
        SoldierClient[] warSoldiers = {
            new SoldierClient(),
            new SoldierClient(),
            new SoldierClient(),
            new SoldierClient(),
            new SoldierClient()
        };

        // 移动士兵的位置
        warSoldiers[0].moveSoldier(137, 112);
        warSoldiers[1].moveSoldier(17, 122);

        /**
         * 注意，对于5个士兵对象只存在一个SoldierImp（享元实现）
         * Soldier Client因为其自身维护的状态较少，其内存占用也较小
         * 
         * SoldierImp 的内存占用可大可小，但是我们节省了创建5个士兵展现的内存开销
         */
    }
}