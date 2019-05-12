package Controller.Logger;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class ProgramLogger {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void LogException(Exception e)
    {
        LOGGER.log(Level.WARNING, e.toString());
    }
    public void LogInfo(String msg){
        LOGGER.log(Level.INFO, msg);
    }
}
