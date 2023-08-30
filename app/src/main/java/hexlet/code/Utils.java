package hexlet.code;

public class Utils {
    public static int getRandom(int max) {
        int random = (int) (Math.random() * max) + 1;
        return random;
    }
    public static int getRandomLength(int min, int max) {
        int progressionLength = (int) (Math.random() * max) + min;
        return progressionLength;
    }
}
