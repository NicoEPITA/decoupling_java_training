package fr.lernejo.guessname;

public interface Player {
    long askNextGuess();
    void respond(boolean lowerOrGreater);
}
