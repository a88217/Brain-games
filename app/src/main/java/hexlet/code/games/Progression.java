package hexlet.code.games;
import hexlet.code.Game;
public class Progression implements Game {
    public String getRules() {
        String gameRules = "What number is missing in the progression?\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        int progressionLength = (int) (Math.random() * 10) + 5;
        int missingNumber = (int) (Math.random() * progressionLength) + 1;
        int startNumber = (int) (Math.random() * 20) + 1;
        int nextNumber = startNumber;
        int progressionStep = (int) (Math.random() * 10) + 1;
        int correctAnswer = 1;
        String stringQuestion = "" + startNumber;
        if (missingNumber == 1) {
            stringQuestion = "..";
            correctAnswer = startNumber;
        }
        for (int i = 2; i <= progressionLength; i++) {
            if (i == missingNumber) {
                stringQuestion += " ..";
                nextNumber += progressionStep;
                correctAnswer = nextNumber;
            } else {
                nextNumber += progressionStep;
                stringQuestion = stringQuestion + " " + nextNumber;
            }
        }
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
