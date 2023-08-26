package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Progression implements Game {
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
        String question = "" + startNumber;
        if (missingNumber == 1) {
            question = "..";
            correctAnswer = startNumber;
        }
        var result = new StringBuilder(question);
        for (int i = 2; i <= progressionLength; i++) {
            if (i == missingNumber) {
                result.append(" ..");
                nextNumber += progressionStep;
                correctAnswer = nextNumber;
            } else {
                nextNumber += progressionStep;
                result.append(" " + nextNumber);
            }
        }
        String stringQuestion = result.toString();
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
