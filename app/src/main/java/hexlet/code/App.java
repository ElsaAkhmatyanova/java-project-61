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
            case Engine.GREET:
                Cli.gettingName(scanner);
                break;
            case Engine.EVEN:
                EvenGame.determineEvenNumbers(scanner);
                break;
            case Engine.CALC:
                CalcGame.calcNumbers(scanner);
                break;
            case Engine.GCD:
                GCDGame.gcdForNumbers(scanner);
                break;
            case Engine.PROGRESSION:
                ProgressionGame.improveProgression(scanner);
                break;
            case Engine.PRIME:
                PrimeGame.determinePrimeNumbers(scanner);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
