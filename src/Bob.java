import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Talk to Bob: ");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("quit") || userInput.equalsIgnoreCase("exit")) {
                break;
            }
            else if (userInput.endsWith("?")) {
                System.out.println("Sure\n");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!\n");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!\n");
            } else {
                System.out.println("Whatever.\n");

            }

        }

    }

}
