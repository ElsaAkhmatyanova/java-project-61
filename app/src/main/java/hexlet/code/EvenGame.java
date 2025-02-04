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
            String userChoice = scanner.nextLine();

            String correctAnswer = numberForLevel % 2 == 0 ? "yes" : "no";
            boolean evenSuccessCondition = userChoice.equalsIgnoreCase("yes") && userChoice.equalsIgnoreCase(correctAnswer);
            boolean oddSuccessCondition = userChoice.equalsIgnoreCase("no") && userChoice.equalsIgnoreCase(correctAnswer);

            if (evenSuccessCondition || oddSuccessCondition) {
                System.out.println("Correct!");
                levelCounter += 1;
            } else {
                System.out.println("'" + userChoice + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'\nLet's try again, " + userName + "!");
                break;
            }
        }
        if (levelCounter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
