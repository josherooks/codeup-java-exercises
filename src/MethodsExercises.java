import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(5, 4));
//        System.out.println(subtract(5, 4));
//        System.out.println(mult(5, 4));
//        System.out.println(divide(5, 4));
//        System.out.println(mod(6, 3));

        System.out.print("Enter a number between 1 and 10: ");
//        getInteger(1, 10);
        System.out.println(factorial());


    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static long mult(long num1, long num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double mod(double num1, double num2) {
        return num1 % num2;
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.println("Your integer is: " + userInput);
            return userInput;
        } else {
            System.out.println("Sorry that number is out of range\n");
            System.out.printf("Enter another number between %s and %s:%n", min, max);
            return getInteger(min, max);
        }

    }

    public static long factorial(){
        int factNum = getInteger(1, 10);
        long currentSum = 1;
        for(int count = 1; count <= factNum; count++){
            currentSum *= count;
        }
        return currentSum;
//       Scanner sc1 = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        num1 = sc1.nextInt();
//
//       if (num1 == 0) {
//           System.out.println("Your factorial is: \n" + num1);
//           return num1;
//       }else {
//           System.out.println("Your factorial is: \n" + num1);
//           return num1 * factorial(num1 - 1);
//       }
    }

public static boolean cont(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to continue?");
    String answer = sc.nextLine();
    if (answer.equals("yes")){
        return true;
    }else{
        return false;
    }
}


}
