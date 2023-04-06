package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        return new Logger() {
            @Override
            public void log(String message) {
                System.out.println(message);
            }
        };
    }
}



//token : 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
