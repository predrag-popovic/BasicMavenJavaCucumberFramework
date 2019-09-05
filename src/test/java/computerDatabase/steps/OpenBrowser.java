package computerDatabase.steps;

import org.apache.log4j.xml.DOMConfigurator;
import utility.Setup;

/***
 * Setup for testing on local machine or for using Selenium Grid
 */
public class OpenBrowser extends Setup {

    public void openBrowser() {

        DOMConfigurator.configure("src/main/resources/log4j.xml");

        /***
         * initiationBrowserThatWeUseForTesting
         */
        setBrowser();
    }
}
