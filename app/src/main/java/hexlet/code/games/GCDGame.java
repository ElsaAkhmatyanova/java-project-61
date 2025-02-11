package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Random;

public class GCDGame {
    public static final String GCD_MAIN_QUESTION = "Find the greatest common divisor of given numbers.";

    public static String[][] generateGCDGameData() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];
        Random randomNumeric = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            BigInteger firstNumber = BigInteger.valueOf(randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE));
            BigInteger secondNumber = BigInteger.valueOf(randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE));

            String question = firstNumber + " " + secondNumber;
            String correctAnswer = String.valueOf(calculateGCDForNumbers(firstNumber, secondNumber));

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        return gameData;
    }

    public static int calculateGCDForNumbers(BigInteger firstNumber, BigInteger secondNumber) {
        BigInteger gcd = firstNumber.gcd(secondNumber);
        return gcd.intValue();
    }
}
