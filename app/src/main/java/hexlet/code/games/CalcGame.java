package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Constants;
import hexlet.code.common.Utils;

public class CalcGame {
    public static final String CALC_MAIN_QUESTION = "What is the result of the expression?";

    public static void launchingCalcGame() {
        String[][] gameData = new String[Constants.NUMBER_OF_LEVELS][2];
        StringBuilder randomOperation = new StringBuilder();
        String operationType = "+-*";

        for (int i = 0; i < Constants.NUMBER_OF_LEVELS; i++) {
            int firstNumber = Utils.generateDefaultRandomNumber();
            int secondNumber = Utils.generateDefaultRandomNumber();
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
