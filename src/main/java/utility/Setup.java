package utility;

import elements.LogMessage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;

public class Setup {
    
    private static PropertyManager properties = PropertyManager.getInstance();

    /**
     * Initialization of WebDriver
     */
    public static WebDriver driver;

    /***
     * Logic for executing test on local machine or using Selenium Grid
     */
    public static void setBrowser() {

        if (driver == null) {
            if (properties.getGridActive().equals("false")) {

                /***
                 * Executing test on Local machine
                 */
                switch (properties.getBrowserType()) {
                    case "CHROME":
                        WebDriverManager.chromedriver().version("102.0.5005.61");
                        driver = new ChromeDriver();
                        browserMaximize();
                        break;

                    case "FIREFOX":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        browserMaximize();
                        break;

                    case "OPERA":
                        driver = new OperaDriver();
                        browserMaximize();
                        break;

                    case "SAFARI":
                        System.setProperty("webdriver.safari.noinstall", "true");
                        driver = new SafariDriver();
                        browserMaximize();
                        break;

                    case "EDGE":
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                        browserMaximize();
                }

                /***
                 * Executing test using Selenium Grid
                 */
            } else {

                DesiredCapabilities cap;

                switch (properties.getBrowserType()) {

                    case "CHROME":
                        cap = DesiredCapabilities.chrome();
                        break;

                    case "FIREFOX":
                        cap = DesiredCapabilities.firefox();
                        break;

                    case "IE":
                        cap = DesiredCapabilities.internetExplorer();
                        break;

                    case "EDGE":
                        cap = DesiredCapabilities.edge();
                        break;

                    default:
                        cap = DesiredCapabilities.chrome();
                }

                switch (properties.getOsType()) {

                    case "WIN10":
                        cap.setPlatform(Platform.WIN10);
                        break;

                    case "WIN8":
                        cap.setPlatform(Platform.WIN8);
                        break;

                    case "VISTA":
                        cap.setPlatform(Platform.VISTA);
                        break;

                    case "LINUX":
                        cap.setPlatform(Platform.LINUX);
                        break;

                    default:
                        cap.setPlatform(Platform.LINUX);
                        break;
                }

                URL url = null;

                try {
                    url = new URL(properties.getEnvHubUrl());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                driver = new RemoteWebDriver(url, cap);
                browserMaximize();
            }
        }
    }

    /***
     * Browser Maximize
     */
    public static void browserMaximize() {
        driver.manage().window().fullscreen();
        LogMessage.info("Browser maximize");
    }
}
