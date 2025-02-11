package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class GCDGame {
    public static void gcdForNumbers(Scanner scanner) {
        String userName = Cli.gettingName(scanner);
        System.out.println("Find the greatest common divisor of given numbers.");

        Random randomNumeric = new Random();
        int randomNumberRange = 200;

        int levelCounter = 0;
        int numberOfLevels = 3;
        int correctAnswer;

        for (int i = 1; i <= numberOfLevels; i++) {
            BigInteger firstNumber = BigInteger.valueOf(randomNumeric.nextInt(randomNumberRange));
            BigInteger secondNumber = BigInteger.valueOf(randomNumeric.nextInt(randomNumberRange));
            correctAnswer = calculateGCDForNumbers(firstNumber, secondNumber);

            System.out.println("Question: " + firstNumber.intValue() + " " + secondNumber.intValue());
            String userAnswer = Engine.getGamerAnswer(scanner);

            if (Integer.parseInt(userAnswer) == correctAnswer) {
                Engine.rightAnswerForLevel();
                levelCounter += 1;
            } else {
                Engine.errorMessageForUser(userAnswer, String.valueOf(correctAnswer), userName);
                break;
            }
            Engine.successfulGameMessage(userName, levelCounter);
        }
    }

    public static int calculateGCDForNumbers(BigInteger firstNumber, BigInteger secondNumber) {
        BigInteger gcd = firstNumber.gcd(secondNumber);
        return gcd.intValue();
    }
}
