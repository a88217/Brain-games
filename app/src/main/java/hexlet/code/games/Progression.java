package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public class Progression implements Game {
    public String getRules() {
        String gameRules = "What number is missing in the progression?\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        final int minProgressionLength = 5;
        final int maxProgressionLength = 10;
        final int maxProgressionStep = 10;
        final int maxStartNumber = 20;
        int progressionLength = (int) (Math.random() * maxProgressionLength) + minProgressionLength;
        int missingNumber = Utils.getRandom(progressionLength);
        int startNumber = Utils.getRandom(maxStartNumber);
        int nextNumber = startNumber;
        int progressionStep = Utils.getRandom(maxProgressionStep);
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
