package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Constants;
import hexlet.code.common.Utils;

public class EvenGame {
    public static final String EVEN_MAIN_QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void launchingEvenGame() {
        String[][] gameData = new String[Constants.NUMBER_OF_LEVELS][2];

        for (int i = 0; i < Constants.NUMBER_OF_LEVELS; i++) {
            int number = Utils.generateDefaultRandomNumber();
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }

        Engine.runGame(EVEN_MAIN_QUESTION, gameData);
    }
}
