package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    public static final String CALC_MAIN_QUESTION = "What is the result of the expression?";

    public static String[][] generateCalcGameData() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];
        Random randomNumeric = new Random();
        StringBuilder randomOperation = new StringBuilder();
        String operationType = "+-*";

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int firstNumber = randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE);
            int secondNumber = randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE);
            randomOperation.append(operationType.charAt(randomNumeric.nextInt(operationType.length())));

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
        return gameData;
    }
}
