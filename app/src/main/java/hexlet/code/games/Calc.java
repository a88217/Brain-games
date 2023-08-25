package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
public class Calc {
    public static void calc() {
        String userName = Engine.greeting();
        int answerCounter = 0;
        while (answerCounter < 3) {
            int num1 = (int) (Math.random() * 30) + 1;
            int num2 = (int) (Math.random() * 30) + 1;
            int operatorIndex = (int) (Math.random() * 3);
            String[] operators = {"+", "-", "*"};
            String question = "" + num1 + " " + operators[operatorIndex] + " " + num2;
            int correctAnswer = 0;
            switch (operatorIndex) {
                case 0:
                    correctAnswer = num1 + num2;
                    break;
                case 1:
                    correctAnswer = num1 - num2;
                    break;
                default:
                    correctAnswer = num1 * num2;
            }
            System.out.println("What is the result of the expression?\n" +
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
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
