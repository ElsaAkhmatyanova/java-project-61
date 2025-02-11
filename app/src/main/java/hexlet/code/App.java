package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNumber = Engine.choosingGame(scanner);

        System.out.println("\nWelcome to the Brain Games!");

        switch (gameNumber) {
            case 1:
                Cli.gettingName(scanner);
                break;
            case 2:
                EvenGame.determineEvenNumbers(scanner);
                break;
            case 3:
                CalcGame.calcNumbers(scanner);
                break;
            case 4:
                GCDGame.gcdForNumbers(scanner);
                break;
            case 5:
                ProgressionGame.improveProgression(scanner);
                break;
            case 6:
                PrimeGame.determinePrimeNumbers(scanner);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
