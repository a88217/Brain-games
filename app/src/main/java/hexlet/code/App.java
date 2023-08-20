package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == 1) {
            Engine.greeting();
        }
        if (choice == 2) {
            Even.even();
        }
        if (choice == 3) {
            Calc.calc();
        }
        if (choice == 4) {
            Gcd.gcd();
        }
    }

}

