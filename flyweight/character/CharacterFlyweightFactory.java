package flyweight.character;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 字符享元 工厂
 */
public class CharacterFlyweightFactory {
    private static final CharacterFlyweightFactory INSTANCE = new CharacterFlyweightFactory();

    private Map<String, CharacterFlyweight> cache = new ConcurrentHashMap();

    private CharacterFlyweightFactory() {
        CharacterFlyweight A = new CharacterFlyweight();
        A.setLetter('A');
        A.setFontFace("微软雅黑");
        A.setFontSize("12");
        cache.put("A", A);

        CharacterFlyweight B = new CharacterFlyweight();
        B.setLetter('B');
        B.setFontFace("微软雅黑");
        B.setFontSize("13");
        cache.put("B", B);

        CharacterFlyweight C = new CharacterFlyweight();
        C.setLetter('C');
        C.setFontFace("微软雅黑");
        C.setFontSize("14");
        cache.put("C", C);

        // other letters ...
    }

    public static final CharacterFlyweightFactory getInstance() {
        return INSTANCE;
    }

    public CharacterFlyweight getCharacter(String letter){
        if(cache.containsKey(letter)){
            return cache.get(letter);
        }
        return null;
    }
}