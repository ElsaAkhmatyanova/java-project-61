package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Utils;

public class ProgressionGame {
    public static final String PROGRESSION_MAIN_QUESTION = "What number is missing in the progression?";
    public static final int DEFAULT_RANDOM_NUMBER_RANGE = 100;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_DIFFERENCE = 1;

    public static void launchingProgressionGame() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];
        int missingNumberIndex;

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int[] progression = createProgression();
            missingNumberIndex = Utils.generateRandomNumber(progression.length);

            String question = skipProgressionGenerator(progression, missingNumberIndex);
            String correctAnswer = String.valueOf(progression[missingNumberIndex]);

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        Engine.runGame(PROGRESSION_MAIN_QUESTION, gameData);
    }

    public static int[] createProgression() {
        int[] progression = new int[Utils.generateRandomNumber(MIN_LENGTH, MAX_LENGTH)];
        int difference = Utils.generateRandomNumber(MIN_DIFFERENCE, MAX_LENGTH);
        progression[0] = Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE);

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        return progression;
    }

    public static String skipProgressionGenerator(int[] progression, int index) {
        StringBuilder skipProgression = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i != index) {
                skipProgression.append(progression[i]).append(" ");
            } else {
                skipProgression.append("..").append(" ");
            }
        }
        return skipProgression.toString();
    }
}
