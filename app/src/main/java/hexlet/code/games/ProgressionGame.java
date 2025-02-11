package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_DIFFERENCE = 1;


    public static void improveProgression(Scanner scanner) {
        String userName = Cli.gettingName(scanner);
        System.out.println("What number is missing in the progression?");

        Random randomNumeric = new Random();
        int missingNumberIndex;
        int missingNumber;
        int levelCounter = 0;

        for (int i = 1; i <= Engine.NUMBER_OF_LEVELS; i++) {
            int[] progression = createProgression();
            missingNumberIndex = randomNumeric.nextInt(progression.length);
            missingNumber = progression[missingNumberIndex];

            System.out.println("Question: " + skipProgressionGenerator(progression, missingNumberIndex));
            String userAnswer = Engine.getGamerAnswer(scanner);

            if (Integer.parseInt(userAnswer) == missingNumber) {
                Engine.rightAnswerForLevel();
                levelCounter += 1;
            } else {
                Engine.errorMessageForUser(userAnswer, String.valueOf(missingNumber), userName);
                break;
            }
        }
        Engine.successfulGameMessage(userName, levelCounter);
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
