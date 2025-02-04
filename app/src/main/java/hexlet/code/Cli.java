package hexlet.code;

import java.util.Scanner;

public class Cli {
    int[] gameNumber = new int[]{0,1,2};

    public static String gettingName(Scanner scanner) {
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        if (userName != null) {
            System.out.println("Hello, " + userName + "!");
            return userName;
        } else {
            System.out.println("No input provided!");
            return null;
        }
    }

    public static void choosingGame(Scanner scanner) {
        String userGameChoice = scanner.nextLine();
        if (userGameChoice != null) {
            System.out.println("Your choice: " + userGameChoice);
        } else {
            System.out.println("No input provided!");
        }
    }
}
