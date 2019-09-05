package elements;

import enums.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementGlobal {

    public static WebDriver driver = null;
    public static Browser browser = null;

    public ElementGlobal(WebDriver driver) {
        this.driver = driver;
    }

    /******************************************************************************
     METHODS FOR FIND ELEMENT WITHOUT ACTION
     *****************************************************************************/

    /***
     * findElementById
     * @param id
     * @return
     */
    public WebElement findElementById(String id) {
        try {
            return driver.findElement(By.id(id));
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * findElementByXPath
     * @param xPath
     * @return
     */
    public WebElement findElementByXPath(String xPath) {
        try {
            return driver.findElement(By.xpath(xPath));
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * findElementByCss
     * @param css
     * @return
     */
    public WebElement findElementByCss(String css) {
        try {
            return driver.findElement(By.cssSelector(css));
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * findElementByLinkText
     * @param linkText
     * @return
     */
    public WebElement findElementByLinkText(String linkText) {
        try {
            return driver.findElement(By.linkText(linkText));
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * findElementByClassName
     * @param className
     * @return
     */
    public WebElement findElementByClassName(String className) {
        try {
            return driver.findElement(By.className(className));
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }

    /***
     * findElementByTagName
     * @param tagName
     * @return
     */
    public WebElement findElementByTagName(String tagName) {
        try {
            return driver.findElement(By.tagName(tagName));
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return null;
        }
    }
}

