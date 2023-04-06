package fr.lernejo.guessgame;

public class ComputerPlayer implements Player {

    private long min = 0;
    private long max = 100;
    private long lastGuess = -1;

    public int getNumberToGuess() {
        return (int) ((min + max) / 2);
    }

    public void updateWithResult(boolean result) {
        if (result) {
            max = lastGuess;
        } else {
            min = lastGuess + 1;
        }
    }

    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
