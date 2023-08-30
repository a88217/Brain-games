package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final Integer QUESTION = 0;
    public static final Integer ANSWER = 1;
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
        public static void startGame(Game game) {
        String userName = greeting();
        int answerCounter = 0;
        final int maxRounds = 3;
        while (answerCounter < maxRounds) {
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
                answerCounter = 0;
                break;
            }
        }
        if (answerCounter == maxRounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
