package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public class Even implements Game{
    public String getRules() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        final int maxNumber = 99;
        int question = Utils.getRandom(maxNumber);
        String correctAnswer = question % 2 == 0 ? "yes" : "no";
        String stringQuestion = Integer.toString(question);
        String[] gameData = {stringQuestion, correctAnswer};
        return gameData;
    }
}
