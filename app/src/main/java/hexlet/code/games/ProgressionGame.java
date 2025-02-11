package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    public static final String PROGRESSION_MAIN_QUESTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_DIFFERENCE = 1;

    public static String[][] generateProgressionGameData() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];
        Random randomNumeric = new Random();
        int missingNumberIndex;

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int[] progression = createProgression();
            missingNumberIndex = randomNumeric.nextInt(progression.length);

            String question = skipProgressionGenerator(progression, missingNumberIndex);
            String correctAnswer = String.valueOf(progression[missingNumberIndex]);

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        return gameData;
    }

    public static int[] createProgression() {
        Random randomNumeric = new Random();
        int[] progression = new int[randomNumeric.nextInt(MIN_LENGTH, MAX_LENGTH)];
        int difference = randomNumeric.nextInt(MIN_DIFFERENCE, MAX_LENGTH);
        progression[0] = randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE);

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
