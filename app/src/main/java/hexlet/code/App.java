package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    public static final String EXIT = "0";
    public static final String GREET = "1";
    public static final String EVEN = "2";
    public static final String CALC = "3";
    public static final String GCD = "4";
    public static final String PROGRESSION = "5";
    public static final String PRIME = "6";
        public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case GREET -> Cli.greeting();
            case EVEN -> Engine.startGame(new Even());
            case CALC -> Engine.startGame(new Calc());
            case GCD -> Engine.startGame(new Gcd());
            case PROGRESSION -> Engine.startGame(new Progression());
            case PRIME -> Engine.startGame(new Prime());
            case EXIT -> System.out.println("Exit game");
            default -> System.out.println("Unknown game number");
        }
    }
}

