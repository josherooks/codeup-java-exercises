package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private  ArrayList <Integer> grades = new ArrayList<>();

    public String getName(){
        this.name =name;
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);

    }

    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

}
