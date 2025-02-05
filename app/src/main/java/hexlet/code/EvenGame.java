package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void determineEvenNumbers(Scanner scanner, String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random randomNumeric = new Random();
        int numberForLevel;
        int levelCounter = 0;

        for (int i = 1; i < 4; i++) {
            numberForLevel = randomNumeric.nextInt(1000);
            System.out.println("Question: " + numberForLevel);
            String userAnswer = scanner.nextLine();

            String correctAnswer = numberForLevel % 2 == 0 ? "yes" : "no";
            boolean evenSuccessCondition = userAnswer.equalsIgnoreCase("yes")
                    && userAnswer.equalsIgnoreCase(correctAnswer);
            boolean oddSuccessCondition = userAnswer.equalsIgnoreCase("no")
                    && userAnswer.equalsIgnoreCase(correctAnswer);

            if (evenSuccessCondition || oddSuccessCondition) {
                Engine.rightAnswerForLevel(levelCounter);
            } else {
                Engine.errorMessageForUser(userAnswer, correctAnswer, userName);
                break;
            }
        }
        Engine.successfulGameMessage(userName, levelCounter);
    }
}
