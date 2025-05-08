package DesignPatterns.compositeDesignPattern.withComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> filesAndDirectories;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        filesAndDirectories = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        filesAndDirectories.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name is:" + directoryName);
        for(FileSystem fileSystem: filesAndDirectories) {
            fileSystem.ls();
        }
    }
}
