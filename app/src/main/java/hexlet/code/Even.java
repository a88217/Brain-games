package hexlet.code;
import java.util.Scanner;
public class Even {
    public static void even() {
        Scanner name = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = name.next();
        System.out.println("Hello, " + userName + "!");
        int answerCounter = 0;
        while (answerCounter < 3) {
            int question = (int) (Math.random() * 99) + 1;
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                    "Question: " + question);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            if ((question % 2 == 0 && answer.equals("yes")) || (question % 2 != 0 && answer.equals("no"))) {
                answerCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                        "Let's try again, Bill!");
                answerCounter = 0;
                break;
            }
        }
        if (answerCounter == 3) {
            System.out.println("Congratulations, " + userName);
        }
        }
}
