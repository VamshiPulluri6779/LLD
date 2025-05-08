package DesignPatterns.compositeDesignPattern.withOutComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String directoryName;
    List<Object> fileList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileList = new ArrayList<>();
    }

    public void add(Object obj) {
        fileList.add(obj);
    }

    public void ls(){        // we can avoid this instanceOf and if-else using composite-design pattern
        for(Object object: fileList){
            if(object instanceof File){
                ((File)object).ls();
            } else if(object instanceof Directory){
                ((Directory)object).ls();
            }
        }
    }

}
