package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Progression implements Game {
    public static final Integer MINPROGRESSIONLENGH = 5;
    public static final Integer MAXPROGRESSIONLENGH = 10;
    public static final Integer MAXPROGRESSIONSTEP = 10;
    public static final Integer MAXSTARTNUMBER = 20;
    public String getRules() {
        String gameRules = "What number is missing in the progression?";
        return gameRules;
    }
    public String[] getData() {
        int progressionLength = Utils.getRandomLength(MINPROGRESSIONLENGH, MAXPROGRESSIONLENGH);
        int missingNumber = Utils.getRandom(progressionLength);
        int startNumber = Utils.getRandom(MAXSTARTNUMBER);
        int progressionStep = Utils.getRandom(MAXPROGRESSIONSTEP);
        int correctAnswer = 1;
        var result = new StringBuilder();
        for (int i = 1; i <= progressionLength; i++) {
            if (i != missingNumber) {
                result.append(startNumber).append(" ");
                startNumber += progressionStep;
            } else {
                result.append("..").append(" ");
                correctAnswer = startNumber;
                startNumber += progressionStep;
            }
        }
        String stringQuestion = result.toString();
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
