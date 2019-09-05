package computerDatabase.page;

import elements.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.PropertyManager;

public class CreateNewComputerPage extends ElementGlobal {

    /***
     * Initialization class for element action
     */
    public Button button = new Button(driver);
    public Input input = new Input(driver);
    public Navigate navigate = new Navigate(driver);
    public Wait wait = new Wait(driver);

    /***
     * Defining locators
     */
    public String addNewComputer = "add";
    public String computerNameField = "name";
    public String introducedField = "introduced";
    public String discontinuedField = "discontinued";
    public String companyField = "company";
    public String createThisComputer = "input.btn.primary";
    public String validationFieldNotification = "div.clearfix.error > label";
    public String searchField = "searchbox";
    public String filterByName = "searchsubmit";

    private static PropertyManager properties = PropertyManager.getInstance();

    public CreateNewComputerPage(WebDriver driver) {
        super(driver);
    }

    /***
     * openComputerDataBase
     */
    public void openComputerDataBase() {

        navigate.openPage(properties.getApplicationEnv());
    }

    /***
     * waitButtonAddNewComputer
     */
    public void waitButtonAddNewComputer() {

        wait.ElementToBeClickableById(addNewComputer, 10);
    }

    /***
     * buttonAddNewComputer
     */
    public void buttonAddNewComputer() {

        button.findElementByIdAndClick(addNewComputer);
    }

    /***
     * waitButtonCreateThisComputer
     */
    public void waitButtonCreateThisComputer() {

        wait.ElementToBeClickableByCSS(createThisComputer, 10);
    }

    /***
     * clickOnButtonCreateThisComputer
     */
    public void clickOnButtonCreateThisComputer() {

        button.findElementByCssAndClick(createThisComputer);
    }

    /***
     * getActualResultForRequiredFieldValidation
     */
    public String getActualResultForRequiredFieldValidation() {

        WebElement validationForRequiredField = findElementByCss(validationFieldNotification);
        return validationForRequiredField.getText();
    }

    /***
     * waitIntroducedDateField
     */
    public void waitIntroducedDateField() {

        wait.ElementToBeClickableById(introducedField, 10);
    }

    /***
     * enterDataInIntroducedDateField
     */
    public void enterDataInIntroducedDateField(String testDataForIntroducedDate) {

        input.findElementByIdAndSendKeys(introducedField, testDataForIntroducedDate);
    }

    /***
     * waitDiscontinuedDateField
     */
    public void waitDiscontinuedDateField() {

        wait.ElementToBeClickableById(discontinuedField, 10);
    }

    /***
     * enterDataInDiscontinuedDateField
     */
    public void enterDataInDiscontinuedDateField(String testDataForDiscontinuedField) {

        input.findElementByIdAndSendKeys(discontinuedField, testDataForDiscontinuedField);
    }

    /***
     * waitCompanyField
     */
    public void waitCompanyField() {

        wait.ElementToBeClickableById(companyField, 10);
    }

    /***
     * selectCompanyFromList
     */
    public void selectCompanyFromList(String companyName) {

        Select company = new Select(findElementById(companyField));
        company.selectByVisibleText(companyName);
    }

    /***
     * enterDataInComputerNameField
     */
    public void enterDataInComputerNameField(String computerName) {

        input.findElementByIdAndSendKeys(computerNameField, computerName);
    }

    /***
     * waitSearchField
     */
    public void waitSearchField() {

        wait.ElementToBeClickableById(searchField, 10);
    }

    /***
     * enterDataInSearchField
     */
    public void enterDataInSearchField(String computerName) {

        input.findElementByIdAndSendKeys(searchField, computerName);
    }

    /***
     * clickOnButtonForFilterByName
     */
    public void clickOnButtonForFilterByName() {

        button.findElementByIdAndClick(filterByName);
    }

    /***
     * waitComputerNameFromList
     */
    public void waitComputerNameFromList(String computerName) {

        wait.ElementToBeClickableByLinkText(computerName, 10);
    }

    /***
     * clickOnComputerNameFromList
     */
    public void clickOnComputerNameFromList(String computerName) {

        button.findElementByLinkTextAndClick(computerName);
    }

    /***
     * getActualResultFormCompanyNameField
     */
    public String getActualResultFormCompanyNameField() {

        WebElement getActualResultFormCompanyNameField = findElementById(computerNameField);
        return getActualResultFormCompanyNameField.getAttribute("value");
    }

    /***
     * getActualResultFormIntroducedDateField
     */
    public String getActualResultFormIntroducedDateField() {

        WebElement getActualResultFormIntroducedDateField = findElementById(introducedField);
        return getActualResultFormIntroducedDateField.getAttribute("value");
    }

    /***
     * getActualResultFormDiscontinuedDateField
     */
    public String getActualResultFormDiscontinuedDateField() {

        WebElement getActualResultFormDiscontinuedDateField = findElementById(discontinuedField);
        return getActualResultFormDiscontinuedDateField.getAttribute("value");
    }

    /***
     * getActualResultFormCompanyList
     */
    public String getActualResultFormCompanyList() {

        Select select = new Select(findElementById(companyField));
        WebElement option = select.getFirstSelectedOption();
        return option.getText();
    }

}
