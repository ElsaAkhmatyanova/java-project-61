package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameNumber = GamesSettings.choosingGame(scanner);

        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.gettingName(scanner);

        switch (gameNumber) {
            case 1: break;
            case 2: EvenGame.determineEvenNumbers(scanner, userName);
            default: break;
        }

        scanner.close();
    }
}
