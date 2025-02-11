package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        String gameNumber = Engine.choosingGame();

        if (gameNumber == null) {
            System.out.println("The selected game does not exist.");
            return;
        }

        String[][] gameData = null;
        String gameTask = null;

        switch (gameNumber) {
            case "1":
                Cli.greet();
                break;
            case "2":
                gameTask = EvenGame.EVEN_MAIN_QUESTION;
                gameData = EvenGame.generateEvenGameData();
                break;
            case "3":
                gameTask = CalcGame.CALC_MAIN_QUESTION;
                gameData = CalcGame.generateCalcGameData();
                break;
            case "4":
                gameTask = GCDGame.GCD_MAIN_QUESTION;
                gameData = GCDGame.generateGCDGameData();
                break;
            case "5":
                gameTask = ProgressionGame.PROGRESSION_MAIN_QUESTION;
                gameData = ProgressionGame.generateProgressionGameData();
                break;
            case "6":
                gameTask = PrimeGame.PRIME_MAIN_QUESTION;
                gameData = PrimeGame.generatePrimeGameData();
                break;
            default:
                break;
        }

        Engine.runGame(gameTask, gameData);
    }
}
