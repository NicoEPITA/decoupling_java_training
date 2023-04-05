package fr.lernejo.guessname;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int numberToGuess = random.nextInt(100);
        Simulation sim = new Simulation(new HumanPlayer());
        sim.initialize(numberToGuess);
        sim.loopUntilPlayerSucceed();
    }
}
