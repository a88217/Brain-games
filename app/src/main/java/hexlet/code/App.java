package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 1:
                Engine.greeting();
                break;
            case 2:
                Even.even();
                break;
            case 3:
                Calc.calc();
                break;
            case 4:
                Gcd.gcd();
                break;
            case 5:
                Progression.progression();
                break;
            case 6:
                Prime.prime();
                break;
            default:
                break;
        }
    }
}

