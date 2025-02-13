package hexlet.code;

import hexlet.code.common.Constants;
import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        boolean isSelectedExistedGame = false;
        for (String i : Constants.LIST_OF_GAMES) {
            if (userGameChoice.equalsIgnoreCase(i)) {
                isSelectedExistedGame = true;
                break;
            }
        }
        if (!isSelectedExistedGame) {
            userGameChoice = null;
        }

        switch (userGameChoice) {
            case "1":
                Cli.greet();
                return;
            case "2":
                EvenGame.launchingEvenGame();
                break;
            case "3":
                CalcGame.launchingCalcGame();
                break;
            case "4":
                GCDGame.launchingGCDGame();
                break;
            case "5":
                ProgressionGame.launchingProgressionGame();
                break;
            case "6":
                PrimeGame.launchingPrimeGame();
                break;
            case null, default:
                break;
        }
    }
}
