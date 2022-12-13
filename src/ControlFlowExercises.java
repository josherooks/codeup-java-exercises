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

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i % 3 == 0){
                System.out.println("Fizz");
            } if (i % 5 ==0) {
                System.out.println(("Buzz"));
            } if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

        }


    }
}
