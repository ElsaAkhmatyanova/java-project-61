package hexlet.code;

import java.util.Scanner;

public class Cli {

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
}
