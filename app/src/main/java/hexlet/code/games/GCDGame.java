package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Constants;
import hexlet.code.common.Utils;

import java.math.BigInteger;

public class GCDGame {
    public static final String GCD_MAIN_QUESTION = "Find the greatest common divisor of given numbers.";

    public static void launchingGCDGame() {
        String[][] gameData = new String[Constants.NUMBER_OF_LEVELS][2];

        for (int i = 0; i < Constants.NUMBER_OF_LEVELS; i++) {
            BigInteger firstNumber = BigInteger.valueOf(Utils.generateDefaultRandomNumber());
            BigInteger secondNumber = BigInteger.valueOf(Utils.generateDefaultRandomNumber());

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
