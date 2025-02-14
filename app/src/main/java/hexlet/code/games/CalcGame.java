package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Utils;

public class CalcGame {
    public static final String CALC_MAIN_QUESTION = "What is the result of the expression?";
    public static final int DEFAULT_RANDOM_NUMBER_RANGE = 100;

    public static void launchingCalcGame() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];
        StringBuilder randomOperation = new StringBuilder();
        String operationType = "+-*";

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int firstNumber = Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE);
            int secondNumber = Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE);
            randomOperation.append(operationType.charAt(Utils.generateRandomNumber(operationType.length())));

            String question = firstNumber + " " + randomOperation + " " + secondNumber;
            String correctAnswer;

            if (randomOperation.toString().equalsIgnoreCase("+")) {
                correctAnswer = String.valueOf(firstNumber + secondNumber);
            } else if ((randomOperation.toString().equalsIgnoreCase("-"))) {
                correctAnswer = String.valueOf(firstNumber - secondNumber);
            } else {
                correctAnswer = String.valueOf(firstNumber * secondNumber);
            }

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;

            randomOperation.deleteCharAt(0);
        }
        Engine.runGame(CALC_MAIN_QUESTION, gameData);
    }
}
