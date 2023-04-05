package fr.lernejo.guessname;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;


public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;
    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */

    boolean nextRound() {
        long guess = player.askNextGuess();
        if (guess == numberToGuess) {
            logger.log("You guessed the right number");
            return true;
        }
        else if (guess > numberToGuess) {
            logger.log("The number is lower than your guess");
            return false;
        }
        else {
            logger.log("The number is greater than your guess");
            return false;
        }
    }

    public void loopUntilPlayerSucceed() {
        while (nextRound()) {
            nextRound();
        }
    }
}
