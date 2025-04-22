package DesignPatterns.BuilderDesign;

import java.util.List;

public abstract class StudentBuilder {

    int age;
    String name;
    String gender;
    String fatherName;
    String motherName;
    List<String> subjectList;

    public StudentBuilder setSubjectList(){
        throw new RuntimeException();
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public Student build() {
        return new Student(this);
    }



}
