package elements;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogMessage extends ElementGlobal {

    public LogMessage(WebDriver driver) {
        super(driver);
    }

    /***
     * LOGIC FOR LOGGER LOG
     */
    public static Logger LogMessage = Logger.getLogger(LogMessage.class.getName());//
    // Need to create these methods, so that they can be called

    public static void info(String message) {

        LogMessage.info(message);
    }

    /***
     * METHOD PRINTING MESSAGE IN LOG FILE
     */
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    /***
     * Print message using Log4j
     * @param message
     */
    public void logMessage(String message){
        message = String.format("[%s][%s]", dateFormat.format(new Date()),message);
        LogMessage.info(message);
    }

    /***
     * Print error message using Log4j
     * @param message
     */
    public void errorLogMessage(String message) {
        LogMessage.error(new Exception(message));
    }

    /***
     * Print message in console
     * @param message
     */
    protected void logMessageInConsole(String message){
        System.out.println(message);
    }
}
