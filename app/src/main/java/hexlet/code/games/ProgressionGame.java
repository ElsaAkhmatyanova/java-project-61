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
        int hiddenMemberIndex;

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int firstValue = Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE);
            int stepValue = Utils.generateRandomNumber(MIN_DIFFERENCE, MAX_LENGTH);
            int progressionLength = Utils.generateRandomNumber(MIN_LENGTH, MAX_LENGTH);
            String[] progression = createProgression(firstValue, stepValue, progressionLength);

            hiddenMemberIndex = Utils.generateRandomNumber(progression.length);
            String correctAnswer = progression[hiddenMemberIndex];

            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        Engine.runGame(PROGRESSION_MAIN_QUESTION, gameData);
    }

    public static String[] createProgression(int first, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
