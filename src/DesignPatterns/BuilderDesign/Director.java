package DesignPatterns.BuilderDesign;

public class Director {

    Director() {}

    public Student getStudent(StudentBuilder studentBuilder) {
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngStudent();
        } else if (studentBuilder instanceof MBAstudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngStudent() {
        StudentBuilder studentBuilder = new EngineeringStudentBuilder();
        return studentBuilder.setAge(21).setGender("male").setSubjectList().build();
    }

    private Student createMBAStudent() {
        StudentBuilder studentBuilder = new MBAstudentBuilder();
        return studentBuilder.setAge(21).setGender("male").setSubjectList().build();
    }

}
