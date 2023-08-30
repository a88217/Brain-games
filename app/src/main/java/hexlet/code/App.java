package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    public static final Integer GREET = 1;
    public static final Integer EVEN = 2;
    public static final Integer CALC = 3;
    public static final Integer GCD = 4;
    public static final Integer PROGRESSION = 5;
    public static final Integer PRIME = 6;
        public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case GREET -> Engine.greeting();
            case EVEN -> Engine.startGame(new Even());
            case CALC -> Engine.startGame(new Calc());
            case GCD -> Engine.startGame(new Gcd());
            case PROGRESSION -> Engine.startGame(new Progression());
            case PRIME -> Engine.startGame(new Prime());
            default -> System.out.println("Unknown game number");
        }
    }
}

