package hexlet.code.games;
import hexlet.code.Game;
public class Calc implements Game {

    public String getRules() {
        String gameRules = "What is the result of the expression?\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        int num1 = (int) (Math.random() * 30) + 1;
        int num2 = (int) (Math.random() * 30) + 1;
        int operatorIndex = (int) (Math.random() * 3);
        String[] operators = {"+", "-", "*"};
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
