package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        String pathAsString = name + ".log";
        return new ContextualLogger(name, new FileLogger(pathAsString));
    }
}




//token : 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
