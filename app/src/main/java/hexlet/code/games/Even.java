package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
public class Even {
    public static void even() {
        String userName = Engine.greeting();
        int answerCounter = 0;
        while (answerCounter < 3) {
            int question = (int) (Math.random() * 99) + 1;
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n" +
                    "Question: " + question);
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
