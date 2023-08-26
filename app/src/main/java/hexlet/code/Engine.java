package hexlet.code;
import java.util.Scanner;

public class Engine {
        public static void startGame(Game game) {
        String userName = Cli.greeting();
        int answerCounter = 0;
        while (answerCounter < 3) {
            String[] gameData = game.getGameData();
            String gameQuestion = gameData[0];
            String correctAnswer = gameData[1];
            System.out.println(game.getRules() + gameQuestion);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                answerCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + userName + "!");
                answerCounter = 0;
                break;
            }
        }
        if (answerCounter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
