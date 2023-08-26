package hexlet.code;

import java.util.Scanner;

public class Utils {
    public static int getRandom(int max) {
        int random = (int) (Math.random() * max) + 1;
        return random;
    }
}
