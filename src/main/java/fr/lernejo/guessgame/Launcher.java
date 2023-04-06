package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: Launcher -interactive | -auto <number>");
        } else if (args[0].equals("-interactive")) {
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100);
            Player player = new HumanPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(1000);
        } else if (args[0].equals("-auto") && args.length == 2) {
            long randomNumber = Long.parseLong(args[1]);
            Player player = new ComputerPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(1000);
        } else {
            System.out.println("Usage: Launcher -interactive | -auto <number>");
        }
    }
}





