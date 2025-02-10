package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class GCDGame {
    public static void gcdForNumbers(Scanner scanner, String userName) {
        System.out.println("Find the greatest common divisor of given numbers.");

        Random randomNumeric = new Random();
        int levelCounter = 0;
        int correctAnswer;

        for (int i = 1; i < 4; i++) {
            BigInteger firstNumber = BigInteger.valueOf(randomNumeric.nextInt(200));
            BigInteger secondNumber = BigInteger.valueOf(randomNumeric.nextInt(200));
            correctAnswer = calculateGCDForNumbers(firstNumber,secondNumber);

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
