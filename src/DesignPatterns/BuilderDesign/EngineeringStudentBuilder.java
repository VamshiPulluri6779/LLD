package DesignPatterns.BuilderDesign;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjectList(){
        List<String> subject = new ArrayList<>();
        subject.add("DSA");
        subject.add("C");
        subject.add("C++");
        this.subjectList = subject;
        return this;
    }
}
