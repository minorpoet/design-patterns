package flyweight.character;


public class ConcreteCharacterFlyweight implements ICharacterFlyweight {

    /**
     * 字体大小
     */
    private String fontSize;

    /**
     * 字体
     */
    private String fontFace;

    /**
     * 字母
     */
    private char letter;

    public ConcreteCharacterFlyweight(char letter, String fontSize, String fontFace) {
        this.letter = letter;
        this.fontSize = fontSize;
        this.fontFace = fontFace;
    }

    public String render() {
        return "{letter:" + letter + ", fontSize:" + fontSize + ", fontFace:" + fontFace + "}";
    }
}