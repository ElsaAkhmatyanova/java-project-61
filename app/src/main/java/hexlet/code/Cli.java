package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcomeUser() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = myObj.nextLine();
        if (userName != null) {
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("No input provided!");
        }
        myObj.close();
    }
}
