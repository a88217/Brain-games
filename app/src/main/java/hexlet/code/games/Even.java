package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Even implements Game {
    public static final Integer MAXNUMBER = 99;
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String[] getData() {
        int question = Utils.getRandom(MAXNUMBER);
        String correctAnswer = isEven(question) ? "yes" : "no";
        String stringQuestion = Integer.toString(question);
        String[] gameData = {stringQuestion, correctAnswer};
        return gameData;
    }
}
