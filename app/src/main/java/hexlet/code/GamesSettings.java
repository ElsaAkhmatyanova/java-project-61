package hexlet.code;

import java.util.Scanner;

public class GamesSettings {
    public static int choosingGame(Scanner scanner) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        String userGameChoice = scanner.nextLine();
        int userGame = Integer.parseInt(userGameChoice);

        int[] listOfGames = new int[]{1, 2};
        boolean isSelectedExistedGame = false;

        for (int i : listOfGames) {
            if (i == userGame) {
                isSelectedExistedGame = true;
                break;
            }
        }

        if (isSelectedExistedGame) {
            System.out.println("Your choice: " + userGameChoice +"\n");
            return Integer.parseInt(userGameChoice);
        } else {
            System.out.println("No input provided!");
            return 0;
        }
    }
}
