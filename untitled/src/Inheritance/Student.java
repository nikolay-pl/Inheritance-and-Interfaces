package Inheritance;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;

public class Student extends  Person{
    public String school;
    private final  List<Double> grades = new ArrayList<>();

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void addGrade(double grade){
        if(2 <= grade || grade <= 6){
            this.grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade in invalid!");
        }
    }

    @Override
    public void sayHi(){
        System.out.println("Hello I am a Student, and my name is: " + super.name + ".");
    }
}
