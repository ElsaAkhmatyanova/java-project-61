package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;

import java.util.Random;
import java.util.Scanner;

public class PrimeGame {
    public static void determinePrimeNumbers(Scanner scanner) {
        String userName = Cli.gettingName(scanner);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Random randomNumeric = new Random();

        int numberForLevel;
        int levelCounter = 0;

        for (int i = 1; i <= Engine.NUMBER_OF_LEVELS; i++) {
            numberForLevel = randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE);
            System.out.println("Question: " + numberForLevel);
            String userAnswer = Engine.getGamerAnswer(scanner);

            String correctAnswer = Primes.isPrime(numberForLevel) ? "yes" : "no";
            boolean evenSuccessCondition = userAnswer.equalsIgnoreCase(correctAnswer);
            boolean oddSuccessCondition = userAnswer.equalsIgnoreCase(correctAnswer);

            if (evenSuccessCondition || oddSuccessCondition) {
                Engine.rightAnswerForLevel();
                levelCounter += 1;
            } else {
                Engine.errorMessageForUser(userAnswer, correctAnswer, userName);
                break;
            }
        }
        Engine.successfulGameMessage(userName, levelCounter);
    }
}
