package computerDatabase.steps;

import computerDatabase.page.CreateNewComputerPage;
import computerDatabase.util.GetScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateNewComputerStepDefinition extends OpenBrowser {

    /***
     * Defining Test data
     */
    public String computerName = "GeckoComputerTest";
    public String introducedData = "2017-12-10";
    public String discontinuedDate = "2016-11-15";
    public String company = "Netronics";

    /***
     * Defining Expected Result
     */
    public String validationForComputerName = "Computer name";
    public String validationForIntroducedDate = "Introduced date";
    public String validationForDiscontinuedDate = "Discontinued date";
    public String fieldIntroduced = "2018-10-10";
    public String fieldDiscontinue = "2019-02-02";
    public String fieldCompany = "Netronics";

    /***
     * Get Current TimeStamp
     */
    Date cur_dt = new Date();
    DateFormat dateFormat = new SimpleDateFormat("HHmmss");
    String timeStamp = dateFormat.format(cur_dt);

    CreateNewComputerPage cn;

    @Before()
    public void setUpBrowser() {
        openBrowser();
        cn = new CreateNewComputerPage(driver);
    }

    @After("@feature_one")
    public void tearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            GetScreenshot.capture(driver, "CaptureScreenShot");
        }
    }

    @Given("^Open computer database page$")
    public void openComputerDatabasePage() {

        cn.openComputerDataBase();
    }

    @And("^Click on button for add new computer$")
    public void clickOnButtonForAddNewComputer() {

        cn.waitButtonAddNewComputer();
        cn.buttonAddNewComputer();
    }

    @When("^Leave all fields empty and click on button create this computer$")
    public void leaveAllFieldsEmptyAndClickOnButtonCreateThisComputer() {

        cn.waitButtonCreateThisComputer();
        cn.clickOnButtonCreateThisComputer();
    }

    @Then("^Verify that User will not create new computer and validation notification will activate on computer name$")
    public void verifyThatUserWillNotCreateNewComputerAndValidationNotificationWillActivateOnComputerName() {

        String actualResultForFieldValidation = cn.getActualResultForRequiredFieldValidation();
        String expectedResultForFieldValidation = validationForComputerName;

        Assert.assertEquals(expectedResultForFieldValidation, actualResultForFieldValidation);
    }

    @When("^Enter data only for field Introduced date ([^\"]*)and click on button create this computer$")
    public void enterDataOnlyForFieldIntroducedDateTestDataForIntroducedDateAndClickOnButtonCreateThisComputer(String testDataForIntroducedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInIntroducedDateField(testDataForIntroducedDate);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Enter data only for field Discontinued date ([^\"]*) and click on button create this computer$")
    public void enterDataOnlyForFieldDiscontinuedDateTestDataForDiscontinuedDateAndClickOnButtonCreateThisComputer(String testDataForDiscontinuedDate) {

        cn.waitDiscontinuedDateField();
        cn.enterDataInDiscontinuedDateField(testDataForDiscontinuedDate);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Select one Company ([^\"]*) from list and click on button create this computer$")
    public void selectOneCompanyFromListAndClickOnButtonCreateThisComputer(String testDataForCompany) {

        cn.waitCompanyField();
        cn.selectCompanyFromList(testDataForCompany);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Enter data in all fields ([^\"]*) except required field Computer name and try to add new computer$")
    public void enterDataInAllFieldsTestDataForIntroducedDateTestDataForDiscontinuedDateTestDataForCompanyExceptRequiredFieldComputerNameAndTryToAddNewComputer(String testDataForCompany) {

        cn.waitIntroducedDateField();
        cn.enterDataInIntroducedDateField(validationForIntroducedDate);
        cn.enterDataInDiscontinuedDateField(validationForDiscontinuedDate);
        cn.selectCompanyFromList(testDataForCompany);
        cn.clickOnButtonCreateThisComputer();

    }

    @When("^Enter wrong format in field Introduced ([^\"]*) date and try to add new computer$")
    public void enterWrongFormatInFieldIntroducedTestDataForIntroducedDateDateAndTryToAddNewComputer(String testDataForIntroducedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(computerName);
        cn.enterDataInIntroducedDateField(testDataForIntroducedDate);
        cn.enterDataInDiscontinuedDateField(discontinuedDate);
        cn.selectCompanyFromList(company);
        cn.clickOnButtonCreateThisComputer();
    }

    @Then("^Verify that user will not create new computer and validation notification will activate on Introduced date field$")
    public void verifyThatUserWillNotCreateNewComputerAndValidationNotificationWillActivateOnIntroducedDateField() {

        String actualResultForFieldValidation = cn.getActualResultForRequiredFieldValidation();
        String expectedResultForFieldValidation = validationForIntroducedDate;

        Assert.assertEquals(expectedResultForFieldValidation, actualResultForFieldValidation);
    }

    @When("^Enter text data in field Introduced ([^\"]*) date and try to add new computer$")
    public void enterTextDataInFieldIntroducedTestDataForIntroducedDateDateAndTryToAddNewComputer(String testDataForIntroducedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(computerName);
        cn.enterDataInIntroducedDateField(testDataForIntroducedDate);
        cn.enterDataInDiscontinuedDateField(discontinuedDate);
        cn.selectCompanyFromList(company);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Enter number in field Introduced ([^\"]*) date and try to add new computer$")
    public void enterNumberInFieldIntroducedTestDataForIntroducedDateDateAndTryToAddNewComputer(String testDataForIntroducedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(computerName);
        cn.enterDataInIntroducedDateField(testDataForIntroducedDate);
        cn.enterDataInDiscontinuedDateField(discontinuedDate);
        cn.selectCompanyFromList(company);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Enter wrong format in field Discontinued ([^\"]*) date and try to add new computer$")
    public void enterWrongFormatInFieldDiscontinuedTestDataForDiscontinuedDateDateAndTryToAddNewComputer(String testDataForDiscontinuedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(computerName);
        cn.enterDataInIntroducedDateField(introducedData);
        cn.enterDataInDiscontinuedDateField(testDataForDiscontinuedDate);
        cn.selectCompanyFromList(company);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Enter text data in field Discontinued ([^\"]*) date and try to add new computer$")
    public void enterTextDataInFieldDiscontinuedTestDataForDiscontinuedDateDateAndTryToAddNewComputer(String testDataForDiscontinuedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(computerName);
        cn.enterDataInIntroducedDateField(introducedData);
        cn.enterDataInDiscontinuedDateField(testDataForDiscontinuedDate);
        cn.selectCompanyFromList(company);
        cn.clickOnButtonCreateThisComputer();
    }

    @When("^Enter number in field Discontinued ([^\"]*) date and try to add new computer$")
    public void enterNumberInFieldDiscontinuedTestDataForDiscontinuedDateDateAndTryToAddNewComputer(String testDataForDiscontinuedDate) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(computerName);
        cn.enterDataInIntroducedDateField(introducedData);
        cn.enterDataInDiscontinuedDateField(testDataForDiscontinuedDate);
        cn.selectCompanyFromList(company);
        cn.clickOnButtonCreateThisComputer();
    }

    @Then("^Verify that user will not create new computer and validation notification will activate on Discontinued date field$")
    public void verifyThatUserWillNotCreateNewComputerAndValidationNotificationWillActivateOnDiscontinuedDateField() {

        String actualResultForFieldValidation = cn.getActualResultForRequiredFieldValidation();
        String expectedResultForFieldValidation = validationForDiscontinuedDate;

        Assert.assertEquals(expectedResultForFieldValidation, actualResultForFieldValidation);
    }

    @When("^Enter valid data in Computer name ([^\"]*),Introduced date ([^\"]*),Discontinued date ([^\"]*) and select company ([^\"]*) and add new computer$")
    public void enterValidDataInComputerNameTestDataForComputerNameIntroducedDateTestDataForIntroducedDateDiscontinuedDateTestDataForDiscontinuedDateAndSelectCompanyTestDataForCompanyAndAddNewComputer(String testDataForComputerName, String testDataForIntroducedDate, String testDataForDiscontinuedDate, String testDataForCompany) {

        cn.waitIntroducedDateField();
        cn.enterDataInComputerNameField(testDataForComputerName + timeStamp);
        cn.enterDataInIntroducedDateField(testDataForIntroducedDate);
        cn.enterDataInDiscontinuedDateField(testDataForDiscontinuedDate);
        cn.selectCompanyFromList(testDataForCompany);
        cn.clickOnButtonCreateThisComputer();
    }

    @Then("^Verify that User successfully add new computer ([^\"]*) and check saved data$")
    public void verifyThatUserSuccessfullyAddNewComputerAndCheckSavedData(String testDataForComputerName) {

        String expectedResultGetDataFromComputerName = testDataForComputerName + timeStamp;
        String expectedResultGetDateFromIntroducedDate = fieldIntroduced;
        String expectedResultGetDateFromDiscontinuedDate = fieldDiscontinue;
        String expectedResultGetDateFromCompany = fieldCompany;

        cn.waitSearchField();
        cn.enterDataInSearchField(testDataForComputerName + timeStamp);
        cn.clickOnButtonForFilterByName();
        cn.waitComputerNameFromList(testDataForComputerName + timeStamp);
        cn.clickOnComputerNameFromList(testDataForComputerName + timeStamp);
        cn.waitIntroducedDateField();

        String actualResultGetDataFromComputerName = cn.getActualResultFormCompanyNameField();
        String actualResultGetDataFromIntroducedDate = cn.getActualResultFormIntroducedDateField();
        String actualResultGetDataFromDiscontinuedDate = cn.getActualResultFormDiscontinuedDateField();
        String actualResultGetDataFromCompany = cn.getActualResultFormCompanyList();

        Assert.assertEquals(expectedResultGetDataFromComputerName, actualResultGetDataFromComputerName);
        Assert.assertEquals(expectedResultGetDateFromIntroducedDate, actualResultGetDataFromIntroducedDate);
        Assert.assertEquals(expectedResultGetDateFromDiscontinuedDate, actualResultGetDataFromDiscontinuedDate);
        Assert.assertEquals(expectedResultGetDateFromCompany, actualResultGetDataFromCompany);
    }
}