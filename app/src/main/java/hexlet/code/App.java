package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\n");

        Scanner scanner = new Scanner(System.in);

        Cli.choosingGame(scanner);
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.gettingName(scanner);

        EvenGame.determineEvenNumbers(scanner, userName);

        scanner.close();
    }
}
