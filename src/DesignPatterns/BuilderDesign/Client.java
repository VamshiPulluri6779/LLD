package DesignPatterns.BuilderDesign;

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        Student student1 = director.getStudent(new EngineeringStudentBuilder());
        System.out.println(student1);

        Student student2 = director.getStudent(new MBAstudentBuilder());
        System.out.println(student2);

    }
}
