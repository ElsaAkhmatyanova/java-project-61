package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Utils;

import java.math.BigInteger;

public class GCDGame {
    public static final String GCD_MAIN_QUESTION = "Find the greatest common divisor of given numbers.";
    public static final int DEFAULT_RANDOM_NUMBER_RANGE = 100;

    public static void launchingGCDGame() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            BigInteger firstNumber = BigInteger.valueOf(Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE));
            BigInteger secondNumber = BigInteger.valueOf(Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE));

            String question = firstNumber + " " + secondNumber;
            String correctAnswer = String.valueOf(calculateGCDForNumbers(firstNumber, secondNumber));

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        Engine.runGame(GCD_MAIN_QUESTION, gameData);
    }

    public static int calculateGCDForNumbers(BigInteger firstNumber, BigInteger secondNumber) {
        BigInteger gcd = firstNumber.gcd(secondNumber);
        return gcd.intValue();
    }
}
