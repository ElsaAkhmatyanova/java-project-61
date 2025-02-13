package hexlet.code.common;

import java.util.Random;

public class Utils {
    private static final Random randomNumeric = new Random();

    public static int generateRandomNumber(int min, int max) {
        return randomNumeric.nextInt(min, max);
    }

    public static int generateRandomNumber(int max) {
        return randomNumeric.nextInt(max);
    }

    public static int generateDefaultRandomNumber() {
        return randomNumeric.nextInt(Constants.DEFAULT_RANDOM_NUMBER_RANGE);
    }



}
