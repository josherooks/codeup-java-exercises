package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication extends Student {
    public static void main(String[] args) {
        String username = new String();

        HashMap<String, Student> students = new HashMap<>();

        Student john = new Student();
        john.addGrade(100);
        john.addGrade(60);
        john.addGrade(80);

        Student mike = new Student();
        mike.addGrade(100);
        mike.addGrade(90);
        mike.addGrade(90);

        Student sam = new Student();
        mike.addGrade(80);
        mike.addGrade(90);
        mike.addGrade(90);

        Student sally = new Student();
        mike.addGrade(80);
        mike.addGrade(100);
        mike.addGrade(100);


        students.put("wickJohn", john);
        students.put("jordanMike", mike);
        students.put("samIAm", sam);
        students.put("downtownSally", sally);

        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome!\n" + "Here are the GitHub usernames of out students:\n");

    }
}