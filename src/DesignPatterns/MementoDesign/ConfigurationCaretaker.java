package DesignPatterns.MementoDesign;

import java.util.*;

public class ConfigurationCaretaker {
    List<ConfigurationMemento> history;

    ConfigurationCaretaker(){
        history = new ArrayList<>();
    }

    public void addMemento(ConfigurationMemento memento){
        this.history.add(memento);
    }

    // retrieve the latest snapshot and remove it
    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            ConfigurationMemento lastesConfigurationMemento = history.get(history.size()-1);

            history.remove(history.size()-1);

            return lastesConfigurationMemento;
        }
        return null;
    }
}
