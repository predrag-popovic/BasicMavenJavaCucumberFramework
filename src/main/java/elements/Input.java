package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static elements.LogMessage.info;

public class Input extends ElementGlobal {

    public Input(WebDriver driver) {
        super(driver);
    }

    WebElement el = null;

    /******************************************************************************
     METHODS FOR FIND ELEMENT AND SEND KEYS
     *****************************************************************************/

    /***
     * findElementByIdAndSendKeys
     * @param id
     * @param keys
     */
    public void findElementByIdAndSendKeys(String id, String keys){
        el = findElementById(id);
        sendKeys(el, keys);
        LogMessage.info("Enter data" + " " + keys + " " + "for element which is located by id:" + " " + id);
    }

    /***
     * findElementByXPathAndSendKeys
     * @param xPath
     * @param keys
     */
    public void findElementByXPathAndSendKeys(String xPath, String keys){
        el = findElementByXPath(xPath);
        sendKeys(el, keys);
        LogMessage.info("Enter data" + " " + keys + " " + "for element which is located by xPath:" + " " + xPath);
    }

    /***
     * findElementByCssAndSendKeys
     * @param css
     * @param keys
     */
    public void findElementByCssAndSendKeys(String css, String keys){
        el = findElementByCss(css);
        sendKeys(el, keys);
        LogMessage.info("Enter data" + " " + keys + " " + "for element which is locate by cssSelector:" + " " + css);
    }

    /***
     * findElementByLinkTextAndSendKeys
     * @param linkText
     * @param keys
     */
    public void findElementByLinkTextAndSendKeys(String linkText, String keys){
        el = findElementByLinkText(linkText);
        sendKeys(el, keys);
        LogMessage.info("Enter data" + " " + keys + " " + "for element which is located by linkText:" + " " + linkText);
    }

    /***
     * findElementByClassNameAndSendKeys
     * @param className
     * @param keys
     */
    public void findElementByClassNameAndSendKeys(String className, String keys){
        el = findElementByClassName(className);
        sendKeys(el, keys);
        LogMessage.info("Enter data" + " " + keys + " " + "for element which is located by className:" + " " + className);
    }

    /***
     * findElementByTagNameAndSendKeys
     * @param tagName
     * @param keys
     */
    public void findElementByTagNameAndSendKeys(String tagName, String keys){
        el = findElementByTagName(tagName);
        sendKeys(el, keys);
        LogMessage.info("Enter data" + " " + keys + " " + "for element which is located by tagName:" + " " + tagName);
    }

    /***
     * sendKeys
     * @param el
     * @param keys
     */
    public void sendKeys(WebElement el, String keys){
        el.sendKeys(keys);
    }
}
