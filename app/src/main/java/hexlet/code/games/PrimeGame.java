package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.math3.primes.Primes;

import java.util.Random;

public class PrimeGame {
    public static final String PRIME_MAIN_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] generatePrimeGameData() {
        String[][] gameData = new String[Engine.NUMBER_OF_LEVELS][2];
        Random randomNumeric = new Random();

        for (int i = 0; i < Engine.NUMBER_OF_LEVELS; i++) {
            int number = randomNumeric.nextInt(Engine.RANDOM_NUMBER_RANGE);

            String question = String.valueOf(number);
            String correctAnswer = Primes.isPrime(number) ? "yes" : "no";

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        return gameData;
    }
}
