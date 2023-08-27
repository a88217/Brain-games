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
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 1 -> Cli.greeting();
            case even -> Engine.startGame(new Even());
            case calc -> Engine.startGame(new Calc());
            case gcd -> Engine.startGame(new Gcd());
            case progression -> Engine.startGame(new Progression());
            case prime -> Engine.startGame(new Prime());
            default -> System.out.println("Exit");
        }
    }
}

