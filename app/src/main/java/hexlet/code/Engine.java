package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_LEVELS = 3;

    public static void runGame(String gameTask, String[][] gameData) {
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
