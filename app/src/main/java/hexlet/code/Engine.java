package hexlet.code;

import java.util.Scanner;

public class Engine {
    protected static final int GREET = 1;
    protected static final int EVEN = 2;
    protected static final int CALC = 3;
    protected static final int GCD = 4;
    protected static final int PROGRESSION = 5;
    protected static final int PRIME = 6;
    protected static final int[] LIST_OF_GAMES = new int[]{GREET, EVEN, CALC, GCD, PROGRESSION, PRIME};

    protected static final int POINTS_TO_WIN = 3;
    public static final int NUMBER_OF_LEVELS = 3;
    public static final int RANDOM_NUMBER_RANGE = 100;

    public static int choosingGame(Scanner scanner) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        String userGameChoice = scanner.nextLine();
        int userGame = Integer.parseInt(userGameChoice);

        boolean isSelectedExistedGame = false;
        for (int i : LIST_OF_GAMES) {
            if (userGame == i) {
                isSelectedExistedGame = true;
                break;
            }
        }

        if (isSelectedExistedGame) {
            return Integer.parseInt(userGameChoice);
        } else {
            System.out.println("No input provided!");
            return 0;
        }
    }

    public static String getGamerAnswer(Scanner scanner) {
        System.out.print("Your answer: ");
        return scanner.nextLine();
    }

    public static void errorMessageForUser(String userAnswer, String correctAnswer, String userName) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                + correctAnswer + "'.\nLet's try again, " + userName + "!");
    }

    public static void rightAnswerForLevel() {
        System.out.println("Correct!");
    }

    public static void successfulGameMessage(String userName, int levelCounter) {
        if (levelCounter == POINTS_TO_WIN) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
