package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Calc implements Game {
    public static final Integer MAXNUMBER = 30;
    public static final String[] OPERATORS={"+", "-", "*"};

    public String getRules() {
        String gameRules = "What is the result of the expression?";
        return gameRules;
    }
    public String[] getData() {
        int num1 = Utils.getRandom(MAXNUMBER);
        int num2 = Utils.getRandom(MAXNUMBER);
        int operatorIndex = (int) (Math.random() * OPERATORS.length);
        String stringQuestion = num1 + " " + OPERATORS[operatorIndex] + " " + num2;
        int correctAnswer = 0;
        switch (OPERATORS[operatorIndex]) {
            case "+":
                correctAnswer = num1 + num2;
                break;
            case "-":
                correctAnswer = num1 - num2;
                break;
            case "*":
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
