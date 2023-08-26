package hexlet.code.games;
import hexlet.code.Game;
public class Gcd implements Game {
    public String getRules() {
        String gameRules = "Find the greatest common divisor of given numbers.\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        int num1 = (int) (Math.random() * 99) + 1;
        int num2 = (int) (Math.random() * 99) + 1;
        int minNumber = num1 < num2 ? num1 : num2;
        int correctAnswer = 1;
        String stringQuestion = "" + num1 + " " + num2;
        for (int i = 2; i <= minNumber; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                correctAnswer = i;
            }
        }
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
