package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Gcd implements Game {
    public static int findGCD(int num1, int num2) {
        int minNumber = num1 < num2 ? num1 : num2;
        int correctAnswer = 1;
        for (int i = 2; i <= minNumber; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                correctAnswer = i;
            }
        }
        return correctAnswer;
    }
    public String getRules() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        return gameRules;
    }
    public String[] getData() {
        final int maxNumber = 99;
        int num1 = Utils.getRandom(maxNumber);
        int num2 = Utils.getRandom(maxNumber);
        int correctAnswer = findGCD(num1, num2);
        String stringQuestion = num1 + " " + num2;
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
