package DesignPatterns.MementoDesign;

public class Client {
    public static void main(String[] args) {
        
        ConfigurationCaretaker caretaker = new ConfigurationCaretaker();
        ConfigurationOriginitor obj = new ConfigurationOriginitor(5, 10);

        System.out.println("The height is "+obj.height+" and the width is "+obj.width);


        ConfigurationMemento memento = obj.createMemento();
        caretaker.addMemento(memento);

        obj.setHeight(10);
        obj.setWidth(20);

        System.out.println("The height is "+obj.height+" and the width is "+obj.width);

        memento = obj.createMemento();
        caretaker.addMemento(memento);

        obj.setHeight(15);
        obj.setWidth(30);
        System.out.println("The height is "+obj.height+" and the width is "+obj.width);

        // after doing above configuration, i want to revert to previous one

        ConfigurationMemento latesConfigurationMemento = caretaker.undo();
        obj.restoreMemento(latesConfigurationMemento);

        System.out.println("The height is "+obj.height+" and the width is "+obj.width);
    }
}
