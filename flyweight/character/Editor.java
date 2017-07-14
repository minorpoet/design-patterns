package flyweight.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 编辑器， 使用大量字符对象
 */
public class Editor {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.writeParagraph();
    }

    /**
     * 书写一个10行120列的段落
     */
    public void writeParagraph() {
        List<Character> characters = new ArrayList<>();
        String[] letters = new String[]{"A", "B", "C"};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 120; j++) {
                characters.add(new Character(letters[random.nextInt(3)], i, j));
            }
        }        for(Character character : characters){
            System.out.println(character);
        }
    }
}
