package fr.lernejo.logger;

public class LoggerFactory {
    public static FileLogger getLogger(String name){
        return new FileLogger("/tmp/" + name);
    }
}




//token : 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
