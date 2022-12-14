import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {

////        While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
////         Do While Loops
//        int count = 100;
//        do {
//            System.out.printf("%s%n", count);
//            count -= 5;
//        }
//        while (count >= -10);

//        double num2 = 2;
//        do {
//            System.out.printf("%s%n", num2);
//            num2 = Math.pow(num2, 2);
//
//        }
//        while (num2 <= 1000000);

//        For Loop
//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        for (double i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            } if (i % 5 ==0) {
//                System.out.println(("Buzz"));
//            } if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//
//        }
//

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        String playAgain = "y";

        while(playAgain.equalsIgnoreCase("y")){
            System.out.println("What number would you like to go to?");
            userInput = scanner.nextInt();
            System.out.println("Here is your table! \n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for(int i = 1; i<+userInput; i++){
                System.out.printf("%s      | %s      | %s     \n", i, i*i, i*i*i);
            }
            System.out.println("Would you like to play again?");
            playAgain = scanner.next();
        }
        Scanner scanner1 = new Scanner(System.in);
        int userInput1 = 0;
        String playAgain1 = "y";

        while(playAgain.equalsIgnoreCase("y")){
            System.out.println("What is your grade??");
            userInput1 = scanner1.nextInt();
            if(userInput1 >= 60 && userInput1 <= 66){
                System.out.println("D");
            }
            else if(userInput1 >= 67 && userInput <= 79){
                System.out.println("C");
            }
            else if(userInput1 >= 80 && userInput <= 87){
                System.out.println("B");
            }
            else if(userInput1 >= 88 && userInput <= 100){
                System.out.println("A");
            }
            else{
                System.out.println("Not on the grading scale.");
            }
            System.out.println("Would you like to play again?");
            playAgain1 = scanner1.next();
        }

    }
}
