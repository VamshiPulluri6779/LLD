package DesignPatterns.MementoDesign;

public class ConfigurationOriginitor {
    int height;
    int width;

    ConfigurationOriginitor(int height, int width){
        this.height = height;
        this.width = width;
    }


    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento restoreMemento){
        this.height = restoreMemento.height;
        this.width = restoreMemento.width;
    }
}
