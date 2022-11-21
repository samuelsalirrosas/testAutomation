package base;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;
public class Browser {

    public static void Start(PageObject page, String navegador) {
        try {
            switch (navegador.trim().toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", new File("src/test/resources/drivers/chromedriver.exe").getAbsolutePath());
                    page.setDriver(new ChromeDriver());
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", new File("drivers/IEDriverServer.exe").getAbsolutePath());
                    page.setDriver(new InternetExplorerDriver());
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", new File("src/test/resources/drivers/msedgedriver.exe").getAbsolutePath());
                    page.setDriver(new EdgeDriver());
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", new File("drivers/geckodriver.exe").getAbsolutePath());
                    page.setDriver(new FirefoxDriver());
                    break;
                case "opera":
                    System.setProperty("webdriver.opera.driver", new File("drivers/operadriver.exe").getAbsolutePath());
                    page.setDriver(new OperaDriver());
                    break;
                default:
                    Assert.fail("No está mapeado el navegador '" + navegador + "'");
                    // Assume.assumeFalse(true);
                    break;
            }
            page.open();
            page.getDriver().manage().window().maximize();

        } catch (Exception e) {
            Assert.fail("Error al abrir el navegador '" + navegador + "'");
            //   Assume.assumeFalse(true);
        }
    }
}
