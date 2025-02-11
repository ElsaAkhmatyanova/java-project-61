package hexlet.code;

import java.util.Scanner;

public class Engine {
    protected static final String[] LIST_OF_GAMES = new String[]{"1", "2", "3", "4", "5", "6"};

    public static final int NUMBER_OF_LEVELS = 3;
    public static final int RANDOM_NUMBER_RANGE = 100;

    public static String choosingGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your choice: ");
        String userGameChoice = scanner.nextLine();

        boolean isSelectedExistedGame = false;
        for (String i : LIST_OF_GAMES) {
            if (userGameChoice.equalsIgnoreCase(i)) {
                isSelectedExistedGame = true;
                break;
            }
        }

        if (isSelectedExistedGame) {
            return userGameChoice;
        } else {
            System.out.println("The selected game does not exist.");
            return null;
        }
    }

    public static void runGame(String gameTask, String[][] gameData) {
        if (gameData == null || gameTask == null) {
            System.out.println("The selected game does not exist.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameTask);

        for (String[] levelData : gameData) {
            String question = levelData[0];
            String correctAnswer = levelData[1];

            System.out.println("Question: " + question);
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
