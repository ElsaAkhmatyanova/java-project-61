package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class ProgressionGame {
    public static void improveProgression(Scanner scanner) {
        String userName = Cli.gettingName(scanner);
        System.out.println("What number is missing in the progression?");

        Random randomNumeric = new Random();

        int missingNumberIndex;
        int missingNumber;
        int levelCounter = 0;
        int numberOfLevels = 3;

        for (int i = 1; i <= numberOfLevels; i++) {
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
        int originValue = 5;
        int boundValue = 10;
        int originValueForDifference = 1;
        int randomNumberRange = 20;

        int[] progression = new int[randomNumeric.nextInt(originValue, boundValue)];
        int difference = randomNumeric.nextInt(originValueForDifference, boundValue);
        progression[0] = randomNumeric.nextInt(randomNumberRange);

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
