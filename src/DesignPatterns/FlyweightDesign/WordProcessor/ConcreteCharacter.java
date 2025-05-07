package DesignPatterns.FlyweightDesign.WordProcessor;

public class ConcreteCharacter implements ICharacter{

    private Character character;
    private String fontType;
    private int size;

    ConcreteCharacter(Character character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    public Character getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int row, int col) {
        // print the character at that row and col position
    }
}
