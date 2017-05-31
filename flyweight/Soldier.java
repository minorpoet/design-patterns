package flyweight;

/**
 * Flyweight Soldier
 */
public interface Soldier {

    /**
     * 将 Soldier 从就位置移至新位置
     * 注意，士兵的位置对于士兵享元来说是外部状态
     * 
     * @param previousLocationX
     * @param previousLocationY
     * @param newLocationX
     * @param newLocationY
     */
    public void moveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY);
}