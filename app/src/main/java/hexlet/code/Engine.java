package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final Integer QUESTION = 0;
    public static final Integer ANSWER = 1;
    public static final Integer MAXROUNDS = 3;
    public static void startGame(Game game) {
        Scanner name = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = name.next();
        System.out.println("Hello, " + userName + "!");
        int answerCounter = 0;
        while (answerCounter < MAXROUNDS) {
            String[] gameData = game.getData();
            String gameQuestion = gameData[QUESTION];
            String correctAnswer = gameData[ANSWER];
            System.out.println(game.getRules());
            System.out.println("Question: " + gameQuestion);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                answerCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            }
        }
        if (answerCounter == MAXROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
