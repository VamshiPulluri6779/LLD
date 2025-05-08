package DesignPatterns.compositeDesignPattern.withOutComposite;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory= new Directory("movies");

        File file = new File("Chaava");
        Directory romanceDirectory = new Directory("Romance");
        File file1 = new File("Dragon");

        romanceDirectory.add(file1);
        movieDirectory.add(file);
        movieDirectory.add(romanceDirectory);

        movieDirectory.ls();
    }
}
