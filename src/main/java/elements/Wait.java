package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends ElementGlobal {

    public Wait(WebDriver driver) {
        super(driver);
    }

    /******************************************************************************
     METHOD FOR WAIT
     *****************************************************************************/

    /***
     * Wait for some time
     * @param waitTime
     */
    public void waitFor(long waitTime) {

        try {
            Thread.sleep(waitTime);
        } catch (java.lang.InterruptedException e) {

            LogMessage.info("Wait for:" + waitTime + "seconds");
        }
    }

    /******************************************************************************
     METHODS FOR WAITING PRESENCE OF SOME ELEMENTS
     *****************************************************************************/

    /***
     * PresenceOfElementByCSS
     * @param css
     * @param seconds
     */
    public WebElement PresenceOfElementByCSS(String css, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
            LogMessage.info("Wait element to be Present which is located by cssSelector:" + css + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * PresenceOfElementById
     * @param id
     * @param seconds
     */
    public WebElement PresenceOfElementById(String id, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
            LogMessage.info("Wait element to be Present which is located by id:" + id + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * PresenceOfElementByXPath
     * @param xpath
     * @param seconds
     */
    public WebElement PresenceOfElementByXPath(String xpath, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            LogMessage.info("Wait element to be Present which is located by XPath:" + xpath + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * PresenceOfElementByLinkText
     * @param linkText
     * @param seconds
     */
    public WebElement PresenceOfElementByLinkText(String linkText, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
            LogMessage.info("Wait element to be Present which is located by linkText:" + linkText + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /******************************************************************************
     METHODS FOR WAITING ELEMENT TO BE CLICKABLE
     *****************************************************************************/

    /***
     * ElementToBeClickableById
     * @param id
     * @param seconds
     */
    public WebElement ElementToBeClickableById(String id, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.elementToBeClickable(By.id(id)));
            LogMessage.info("Wait element to be Clickable which is located by id:" + id + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * ElementToBeClickableByCSS
     * @param css
     * @param seconds
     */
    public WebElement ElementToBeClickableByCSS(String css, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
            LogMessage.info("Wait element to be Clickable which is locate by cssSelector:" + css + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * ElementToBeClickableByXpath
     * @param xpath
     * @param seconds
     */
    public WebElement ElementToBeClickableByXpath(String xpath, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            LogMessage.info("Wait element to be Clickable which is located by Xpath:" + xpath + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * ElementToBeClickableByLinkText
     * @param linkText
     * @param seconds
     */
    public WebElement ElementToBeClickableByLinkText(String linkText, int seconds) {

        try {
            WebElement waitElement = (new WebDriverWait(driver, seconds))
                    .until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
            LogMessage.info("Wait element to be Clickable which is located by LinkText:" + linkText + "," + seconds + "seconds");
            return waitElement;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }
}
