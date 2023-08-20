package hexlet.code;

import java.util.Scanner;

public class Gcd {
    public static void gcd() {
        String userName = Engine.greeting();
        int answerCounter = 0;
        while (answerCounter < 3) {
            int num1 = (int) (Math.random() * 99) + 1;
            int num2 = (int) (Math.random() * 99) + 1;
            int minNumber = num1 < num2 ? num1 : num2;
            int correctAnswer = 1;
            String question = "" + num1 + " " + num2;
            for (int i = 2; i <= minNumber; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    correctAnswer = i;
                }
            }
            System.out.println("Find the greatest common divisor of given numbers.\n" +
                    "Question: " + question);
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == correctAnswer) {
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
