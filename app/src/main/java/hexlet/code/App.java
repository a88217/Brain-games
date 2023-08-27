package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        final int EVEN = 2;
        final int CALC = 3;
        final int GCD = 4;
        final int PROGRESSION = 5;
        final int PRIME = 6;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 1 -> Cli.greeting();
            case EVEN -> Engine.startGame(new Even());
            case CALC -> Engine.startGame(new Calc());
            case GCD -> Engine.startGame(new Gcd());
            case PROGRESSION -> Engine.startGame(new Progression());
            case PRIME -> Engine.startGame(new Prime());
            default -> System.out.println("Exit");
        }
    }
}

