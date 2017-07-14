package flyweight.character;

import com.sun.scenario.effect.impl.state.LinearConvolveKernel;

/**
 * 字符对象，内部使用共享的字符享元
 */
public class Character {
    private int line = 0;

    private int column = 0;

    private ICharacterFlyweight flyweight;

    public Character(String letter, int line, int column) {
        flyweight = CharacterFlyweightFactory.getInstance().getCharacter(letter);
        this.line = line;
        this.column = column;
    }

    /**
     * 行
     */
    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    /**
     * 列
     */
    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("%s at (%d,%d)", flyweight.render(), line, column);
    }
}
