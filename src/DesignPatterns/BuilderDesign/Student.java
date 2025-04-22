package DesignPatterns.BuilderDesign;

import java.util.List;

public class Student {

    int age;
    String name;
    String gender;
    String fatherName;
    String motherName;
    List<String> subjectList;

    Student(StudentBuilder studentBuilder){
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.gender = studentBuilder.gender;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjectList = studentBuilder.subjectList;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", gender=" + gender + ", fatherName=" +
                fatherName + ", motherName=" + motherName + ", subjectList=" + subjectList + "]";
    }
}
