package flyweight.character;


public class CharacterFlyweight {

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


    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }


    public String getFontFace() {
        return fontFace;
    }

    public void setFontFace(String fontFace) {
        this.fontFace = fontFace;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "{letter:" + letter + ", fontSize:" + fontSize + ", fontFace:" + fontFace + "}";
    }
}