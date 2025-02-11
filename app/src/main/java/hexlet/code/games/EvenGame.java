package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void determineEvenNumbers(Scanner scanner) {
        String userName = Cli.gettingName(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random randomNumeric = new Random();
        int randomNumberRange = 1000;

        int numberForLevel;
        int levelCounter = 0;
        int numberOfLevels = 3;

        for (int i = 1; i <= numberOfLevels; i++) {
            numberForLevel = randomNumeric.nextInt(randomNumberRange);
            System.out.println("Question: " + numberForLevel);
            String userAnswer = Engine.getGamerAnswer(scanner);

            String correctAnswer = numberForLevel % 2 == 0 ? "yes" : "no";
            boolean evenSuccessCondition = userAnswer.equalsIgnoreCase(correctAnswer);
            boolean oddSuccessCondition = userAnswer.equalsIgnoreCase(correctAnswer);

            if (evenSuccessCondition || oddSuccessCondition) {
                Engine.rightAnswerForLevel();
                levelCounter += 1;
            } else {
                Engine.errorMessageForUser(userAnswer, correctAnswer, userName);
                break;
            }
        }
        Engine.successfulGameMessage(userName, levelCounter);
    }
}
