package fr.lernejo.guessname;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;
    private Scanner scanner;

    public Simulation(Player player) {
        this.player = player;
        this.numberToGuess = 0;
        this.scanner = new Scanner(System.in);
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**

     @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        logger.log("Enter a number:");
        long playerGuess = scanner.nextLong();
        if (playerGuess == numberToGuess) {
            logger.log("Congratulations! You won!");
            return true;
        } else if (playerGuess < numberToGuess) {
            logger.log("The number to guess is greater than " + playerGuess);
        } else {
            logger.log("The number to guess is smaller than " + playerGuess);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        boolean success = false;
        while (!success) {
            success = nextRound();
        }
    }
}
