package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public class Prime implements Game {
    public String getRules() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        final int maxNumber = 99;
        int question = Utils.getRandom(maxNumber);
        String correctAnswer = "yes";
        for (int i = 2; i < question; i++) {
            if (question % i == 0) {
                correctAnswer = "no";
            }
        }
        String stringQuestion = Integer.toString(question);
        String[] gameData = {stringQuestion, correctAnswer};
        return gameData;
    }
}
