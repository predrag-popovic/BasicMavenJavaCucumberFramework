package elements;

import org.openqa.selenium.WebDriver;

public class CloseDriver extends ElementGlobal {
    
    /***
     * Close driver
     */
    public CloseDriver(WebDriver driver) {
        super(driver);
    }
    public void closeBrowser() {driver.close();
    LogMessage.info("Close driver");}
}
