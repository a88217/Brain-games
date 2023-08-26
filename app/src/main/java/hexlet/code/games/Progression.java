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
        final int minProgressionLength = 5; // Минимальная длина прогрессии
        final int maxProgressionLength = 10; // Максимальная длина прогрессии
        final int maxProgressionStep = 10; // Максимальный шаг
        final int maxStartNumber = 20; // Максимальное стартовое число прогрессии
        int progressionLength = (int) (Math.random() * maxProgressionLength) + minProgressionLength; // Генерируем рандомную длину прогрессии в пределах заданного константами диапазона
        int missingNumber = Utils.getRandom(progressionLength); // Генерируем место пропущенного элемента в прогрессии
        int startNumber = Utils.getRandom(maxStartNumber); // Генерируем стартовое число прогрессии
        int nextNumber = startNumber; // инициализируем переменную для следующего числа прогрессии
        int progressionStep = Utils.getRandom(maxProgressionStep); // Генерируем шаг прогрессии
        int correctAnswer = 1; // инициализируем переменную для вычисления правильного ответа
        String question = "" + startNumber; // инициализируем переменную для формирования строки вопроса и присваиваем ей значение стартового числа в виде строки
        if (missingNumber == 1) {
            question = "..";
            correctAnswer = startNumber;
        } // Для случая когда позиция пропущенного элемента - первая - присваиваем строке с ответом стартовое значение ".."
          // А правильному ответу присваиваем значение стартового числа
        var result = new StringBuilder(question); // объект стрингбилдер для формирования строки с ответом
        for (int i = 2; i <= progressionLength; i++) { // Цикл для формирования строки и вычисления правильного ответа
            if (i == missingNumber) {
                result.append(" ..");
                nextNumber += progressionStep;
                correctAnswer = nextNumber;
            } else {
                nextNumber += progressionStep;
                result.append(" " + nextNumber);
            }
        }
        String stringQuestion = result.toString(); // Перевод объекта стрингбилдер в строку ответа
        String[] gameData = {stringQuestion, Integer.toString(correctAnswer)};
        return gameData;
    }
}
