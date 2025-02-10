package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNumber = Engine.choosingGame(scanner);

        System.out.println("\nWelcome to the Brain Games!");
        String userName = Cli.gettingName(scanner);

        switch (gameNumber) {
            case 1:
                break;
            case 2:
                EvenGame.determineEvenNumbers(scanner, userName);
                break;
            case 3:
                CalcGame.calcNumbers(scanner, userName);
                break;
            case 4:
                GCDGame.gcdForNumbers(scanner, userName);
                break;
            case 5:
                ProgressionGame.improveProgression(scanner, userName);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
