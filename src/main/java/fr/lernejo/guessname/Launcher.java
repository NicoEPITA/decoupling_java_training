package fr.lernejo.guessname;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals("-interactive")) {
            launchInteractiveGame();
        } else if (args.length == 2 && args[0].equals("-auto") && isNumeric(args[1])) {
            launchAutoGame(Long.parseLong(args[1]));
        } else {
            System.out.println("Usage:");
            System.out.println("java Launcher -interactive (play the game interactively with a HumanPlayer)");
            System.out.println("java Launcher -auto <number> (play the game automatically with a ComputerPlayer, guessing the given number)");
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static void launchInteractiveGame() {
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        Player player = new HumanPlayer();
        Simulation simulation = new Simulation(player);
        simulation.initialize(randomNumber);
        simulation.loopUntilPlayerSucceed(1000);
    }

    private static void launchAutoGame(int numberToGuess) {
        Player player = (Player) new ComputerPlayer();
        Simulation simulation = new Simulation(player);
        simulation.initialize(numberToGuess);
        simulation.loopUntilPlayerSucceed(1000);
    }

}
