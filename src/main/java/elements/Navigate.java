package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigate extends ElementGlobal {
    
    public Navigate(WebDriver driver) {
        super(driver);
    }

    /******************************************************************************
     METHODS FOR NAVIGATION BROWSER
     *****************************************************************************/

    WebElement el = null;

    /***
     * Open Page
     * @param urlPage
     */
    public void openPage(String urlPage) {driver.get(urlPage);
        LogMessage.info("Open URL " + urlPage);}
}
