package flyweight.character;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 字符享元 工厂
 */
public class CharacterFlyweightFactory {
    private static final CharacterFlyweightFactory INSTANCE = new CharacterFlyweightFactory();

    private Map<String, ICharacterFlyweight> cache = new ConcurrentHashMap();

    private CharacterFlyweightFactory() {
        ConcreteCharacterFlyweight A = new ConcreteCharacterFlyweight('A', "微软雅黑", "12");
        ConcreteCharacterFlyweight B = new ConcreteCharacterFlyweight('B', "幼圆", "13");
        ConcreteCharacterFlyweight C = new ConcreteCharacterFlyweight('C', "宋体", "14");

        cache.put("A", A);
        cache.put("B", B);
        cache.put("C", C);

        // other letters ...
    }

    public static final CharacterFlyweightFactory getInstance() {
        return INSTANCE;
    }

    public ICharacterFlyweight getCharacter(String letter) {
        if (cache.containsKey(letter)) {
            return cache.get(letter);
        }
        return null;
    }
}