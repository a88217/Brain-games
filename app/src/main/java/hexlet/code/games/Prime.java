package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        String userName = Engine.greeting();
        int answerCounter = 0;
        while (answerCounter < 3) {
            int question = (int) (Math.random() * 99) + 1;
            String correctAnswer = "yes";
            for (int i = 2; i < question; i++) {
                if (question % i == 0) {
                    correctAnswer = "no";
                }
            }
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n" +
                    "Question: " + question);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                answerCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                        "Let's try again, " + userName + "!");
                answerCounter = 0;
                break;
            }
        }
        if (answerCounter == 3) {
            System.out.println("Congratulations, " + userName);
        }
    }
}
