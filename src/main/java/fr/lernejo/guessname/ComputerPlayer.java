package fr.lernejo.guessname;

import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer implements Player {
    private long nextGuess;

    public ComputerPlayer() {
        this.nextGuess = ThreadLocalRandom.current().nextLong(1, 101);
    }

    @Override
    public long askNextGuess() {
        return nextGuess();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            nextGuess = ThreadLocalRandom.current().nextLong(1, nextGuess);
        } else {
            nextGuess = ThreadLocalRandom.current().nextLong(nextGuess + 1, 101);
        }
    }

    private long nextGuess() {
        return (nextGuess + 1 + ThreadLocalRandom.current().nextLong(1, 101)) / 2;
    }
}
