package hexlet.code.common;

import java.util.Random;

public class Utils {
    private static final Random RANDOM_NUMERIC = new Random();

    public static int generateRandomNumber(int min, int max) {
        return RANDOM_NUMERIC.nextInt(min, max);
    }

    public static int generateRandomNumber(int max) {
        return RANDOM_NUMERIC.nextInt(max);
    }

    public static int generateDefaultRandomNumber() {
        return RANDOM_NUMERIC.nextInt(Constants.DEFAULT_RANDOM_NUMBER_RANGE);
    }



}
