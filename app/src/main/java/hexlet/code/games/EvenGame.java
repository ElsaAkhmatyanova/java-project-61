package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Utils;

public class EvenGame {
    public static final String EVEN_MAIN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int DEFAULT_RANDOM_NUMBER_RANGE = 100;

    public static void launchingEvenGame() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int number = Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        Engine.runGame(EVEN_MAIN_QUESTION, gameData);
    }
}
