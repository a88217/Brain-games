package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Calc implements Game {
    public static final Integer MAXNUMBER = 30;

    public String getRules() {
        String gameRules = "What is the result of the expression?";
        return gameRules;
    }
    public String[] getData() {
        int num1 = Utils.getRandom(MAXNUMBER);
        int num2 = Utils.getRandom(MAXNUMBER);
        final String[] operators = {"+", "-", "*"};
        int operatorIndex = (int) (Math.random() * operators.length);
        String stringQuestion = num1 + " " + operators[operatorIndex] + " " + num2;
        int correctAnswer = 0;
        switch (operatorIndex) {
            case 0:
                correctAnswer = num1 + num2;
                break;
            case 1:
                correctAnswer = num1 - num2;
                break;
            case 2:
                correctAnswer = num1 * num2;
                break;
            default:
                System.out.println("Something goes wrong");
                System.exit(0);
        }
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
