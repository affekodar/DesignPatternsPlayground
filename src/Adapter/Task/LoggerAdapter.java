package Adapter.Task;

import java.util.Date;

public class LoggerAdapter implements Logger{
    @Override
    public void log(String str) {
    CandidateLogger candidateLogger = new CandidateLogger();
        candidateLogger.log(str, new Date());
    }
}
