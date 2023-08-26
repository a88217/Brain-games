package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public class Calc implements Game {

    public String getRules() {
        String gameRules = "What is the result of the expression?\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        final int maxNumber = 30;
        int num1 = Utils.getRandom(maxNumber);
        int num2 = Utils.getRandom(maxNumber);
        final String[] operators = {"+", "-", "*"};
        int operatorIndex = (int) (Math.random() * operators.length);
        String stringQuestion = "" + num1 + " " + operators[operatorIndex] + " " + num2;
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
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
