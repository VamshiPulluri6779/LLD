package DesignPatterns.FlyweightDesign.WordProcessor;

public class Main {
    public static void main(String[] args) {

        ICharacter character = CharacterFactory.createCharacter('t');
        character.display(1,2);

        // second time it will fetch from cache
        ICharacter character1 = CharacterFactory.createCharacter('t');
        character1.display(1,2);
    }
}
