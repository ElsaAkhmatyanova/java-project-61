package hexlet.code;

import java.util.Scanner;

public class Engine {
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

        int[] listOfGames = new int[]{1, 2, 3, 4, 5, 6};
        boolean isSelectedExistedGame = false;

        for (int i : listOfGames) {
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
        if (levelCounter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
