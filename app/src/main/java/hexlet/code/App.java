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
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 1 -> Cli.greeting();
            case 2 -> Engine.startGame(new Even());
            case 3 -> Engine.startGame(new Calc());
            case 4 -> Engine.startGame(new Gcd());
            case 5 -> Engine.startGame(new Progression());
            case 6 -> Engine.startGame(new Prime());
        }
    }
}

