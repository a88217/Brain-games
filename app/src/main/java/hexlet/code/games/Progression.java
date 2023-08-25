package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void progression() {
        String userName = Engine.greeting();
        int answerCounter = 0;
        while (answerCounter < 3) {
            int progressionLength = (int) (Math.random() * 10) + 5;
            int missingNumber = (int) (Math.random() * progressionLength) + 1;
            int startNumber = (int) (Math.random() * 20) + 1;
            int nextNumber = startNumber;
            int progressionStep = (int) (Math.random() * 10) + 1;
            int correctAnswer = 1;
            String question = "" + startNumber;
            if (missingNumber == 1) {
                question = "..";
                correctAnswer = startNumber;
            }
            for (int i = 2; i <= progressionLength; i++) {
                if (i == missingNumber) {
                    question += " ..";
                    nextNumber += progressionStep;
                    correctAnswer = nextNumber;
                } else {
                    nextNumber += progressionStep;
                    question = question + " " + nextNumber;
                }
            }
            System.out.println("What number is missing in the progression?\n" +
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
