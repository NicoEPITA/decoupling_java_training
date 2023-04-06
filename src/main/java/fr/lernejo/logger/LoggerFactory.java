package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        Logger consoleLogger = (Logger) new ConsoleLogger();
        return new ContextualLogger(name, consoleLogger);
    }
}
