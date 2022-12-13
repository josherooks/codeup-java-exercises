import java.util.Scanner;
import java.io.*;          // Access System.out

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is : %-10.2f%n", pi);

        //        Explore the Scanner Class.
        //   Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        System.out.printf("Your new integer is: %d%n", userInput);

        //   Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter 3 words separated by a space:");

        String string1 = scanner2.next();
        String string2 = scanner2.next();
        String string3 = scanner2.next();

        System.out.printf("The words you entered are:%n %s%n %s%n %s%n", string1, string2, string3);

        //    Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        //Rewrite the above example using the nextLine method.
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Enter a sentence:");

        String sentence = scanner3.nextLine();

        System.out.printf("Here is the sentence you entered:%n %s%n", sentence);

        //Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Let calculate the area of this room.");
        System.out.println("What is the length of the room, in ft?");
        double length = scanner4.nextInt();

        System.out.println("What is the width of the room, in ft?");

        //Display the area and perimeter of that classroom.
        double width = scanner4.nextInt();
        double area = length * width;
        double perimeter = (length * 2) + (width *2);

        System.out.printf("The area of the room is:%n %s%n", area);
        System.out.printf("The perimeter of the room is:%n %s%n", perimeter);



    }
}
