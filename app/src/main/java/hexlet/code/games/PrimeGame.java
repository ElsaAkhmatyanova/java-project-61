package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.common.Utils;

import org.apache.commons.math3.primes.Primes;

public class PrimeGame {
    public static final String PRIME_MAIN_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int DEFAULT_RANDOM_NUMBER_RANGE = 100;

    public static void launchingPrimeGame() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int number = Utils.generateRandomNumber(DEFAULT_RANDOM_NUMBER_RANGE);

            String question = String.valueOf(number);
            String correctAnswer = Primes.isPrime(number) ? "yes" : "no";

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        Engine.runGame(PRIME_MAIN_QUESTION, gameData);
    }
}
