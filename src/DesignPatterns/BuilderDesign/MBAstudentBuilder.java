package DesignPatterns.BuilderDesign;

import java.util.ArrayList;
import java.util.List;

public class MBAstudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjectList(){
        List<String> subject = new ArrayList<>();
        subject.add("Quant");
        subject.add("HR-Resources");
        this.subjectList = subject;
        return this;
    }
}
