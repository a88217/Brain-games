package hexlet.code.games;
import hexlet.code.Game;
public class Even implements Game{
    public String getRules() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                + "Question: ";
        return gameRules;
    }
    public String[] getGameData() {
        int question = (int) (Math.random() * 99) + 1;
        String correctAnswer = question % 2 == 0 ? "yes" : "no";
        String stringQuestion = Integer.toString(question);
        String[] gameData = {stringQuestion, correctAnswer};
        return gameData;
    }
}
