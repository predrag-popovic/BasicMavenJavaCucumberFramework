package elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static elements.LogMessage.info;

public class Button extends ElementGlobal {
    
    public Button(WebDriver driver) {
        super(driver);
    }
    WebElement el = null;

    /******************************************************************************
     METHODS FOR FIND ELEMENT AND CLICK
     *****************************************************************************/

    /***
     * findElementByIdAndClick
     * @param id
     */
    public void findElementByIdAndClick(String id){
        el = findElementById(id);
        click(el);
        LogMessage.info("Click on element which is located by id:" + " " + id);
    }

    /***
     * findElementByXPathAndClick
     * @param xPath
     */
    public void findElementByXPathAndClick(String xPath){
        el = findElementByXPath(xPath);
        click(el);
        LogMessage.info("Click on element which is located by xPath:" + " " + xPath);
    }

    /***
     * findElementByCssAndClick
     * @param css
     */
    public void findElementByCssAndClick(String css){
        el = findElementByCss(css);
        click(el);
        LogMessage.info("Click on element which is located by cssSelector:" + " " + css);
    }

    /***
     * findElementByLinkTextAndClick
     * @param linkText
     */
    public void findElementByLinkTextAndClick(String linkText){
        el = findElementByLinkText(linkText);
        click(el);
        LogMessage.info("Click on element which is located by linkText:" + " " + linkText);
    }

    /***
     * findElementByClassNameAndClick
     * @param className
     */
    public void findElementByClassNameAndClick(String className){
        el = findElementByClassName(className);
        click(el);
        LogMessage.info("Click on element which is located by className:" + " " + className);
    }

    /***
     * findElementByTagNameAndClick
     * @param tagName
     */
    public void findElementByTagNameAndClick(String tagName){
        el = findElementByTagName(tagName);
        click(el);
        LogMessage.info("Click on element which is located by tagName:" + " " + tagName);
    }

    /***
     * click
     * @param el
     */
    public void click(WebElement el){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",el);
    }


    /********************************************************************************************
     METHOD FOR CLICKING ON SOME ELEMENT USING JAVASCRIPT EXECUTOR EXAMPLE
     ********************************************************************************************/

    /***
     * clickOnSomeElementUsingJavascript
     * @param el
     */
    protected void clickOnSomeElementUsingJavascript(String el){
        ((JavascriptExecutor)driver).executeScript("document.querySelectorAll('a.link')"+"["+el+"].click()");
        LogMessage.info("Click on element which is located by Javascript:" + " " + el);
    }
}
