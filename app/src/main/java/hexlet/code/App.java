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
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                Engine.startGame(new Even());
                break;
            case 3:
                Engine.startGame(new Calc());
                break;
            case 4:
                Engine.startGame(new Gcd());
                break;
            case 5:
                Engine.startGame(new Progression());
                break;
            case 6:
                Engine.startGame(new Prime());
                break;
            default:
                break;
        }
    }
}

