package DesignPatterns.FlyweightDesign.WordProcessor;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    static Map<Character, ICharacter> characters = new HashMap<>();

    public static ICharacter createCharacter(Character c) {
        if(characters.containsKey(c)) {
            return characters.get(c);
        } else {
            ICharacter character = new ConcreteCharacter(c, "Ariel", 10);
            characters.put(c, character);
            return character;
        }
    }
}
