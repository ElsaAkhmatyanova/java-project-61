package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class CalcGame {
    public static void calcNumbers(Scanner scanner) {
        String userName = Cli.gettingName(scanner);
        System.out.println("What is the result of the expression?");

        Random randomNumeric = new Random();
        int randomNumberRange = 100;

        StringBuilder randomOperation = new StringBuilder();
        String operationType = "+-*";
        int levelCounter = 0;
        int numberOfLevels = 3;
        int firstNumber;
        int secondNumber;
        int correctAnswer;

        for (int i = 1; i <= numberOfLevels; i++) {
            firstNumber = randomNumeric.nextInt(randomNumberRange);
            secondNumber = randomNumeric.nextInt(randomNumberRange);
            randomOperation.append(operationType.charAt(randomNumeric.nextInt(operationType.length())));

            System.out.println("Question: " + firstNumber + " " + randomOperation + " " + secondNumber);
            String userAnswer = Engine.getGamerAnswer(scanner);

            if (randomOperation.toString().equalsIgnoreCase("+")) {
                correctAnswer = firstNumber + secondNumber;
            } else if ((randomOperation.toString().equalsIgnoreCase("-"))) {
                correctAnswer = firstNumber - secondNumber;
            } else {
                correctAnswer = firstNumber * secondNumber;
            }
            randomOperation.deleteCharAt(0);

            if (Integer.parseInt(userAnswer) == correctAnswer) {
                Engine.rightAnswerForLevel();
                levelCounter += 1;
            } else {
                Engine.errorMessageForUser(userAnswer, String.valueOf(correctAnswer), userName);
                break;
            }
        }
        Engine.successfulGameMessage(userName, levelCounter);
    }
}
