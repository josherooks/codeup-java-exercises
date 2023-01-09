package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest extends Student{
    public static void main(String[] args) {
       Student bob = new Student();
       bob.addGrade(100);
       bob.addGrade(90);
        System.out.println(bob.getGradeAverage());


    }
}
