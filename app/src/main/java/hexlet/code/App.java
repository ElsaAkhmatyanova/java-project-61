package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNumber = Engine.choosingGame(scanner);

        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.gettingName(scanner);

        switch (gameNumber) {
            case 1: break;
            case 2: EvenGame.determineEvenNumbers(scanner, userName);
            case 3: CalcGame.calcNumbers(scanner, userName);
            default: break;
        }

        scanner.close();
    }
}
