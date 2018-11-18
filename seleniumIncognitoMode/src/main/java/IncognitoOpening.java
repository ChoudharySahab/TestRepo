import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.List;
import java.util.Set;

public class IncognitoOpening {

    public static void main(String...s) {
        IncognitoChrome();
    }


    public static void IncognitoChrome()
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("-incognito");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(DesiredCapabilities.chrome().getBrowserName());
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("https://www.facebook.com");

    }
    public static void PrivateFirefox()
    {
      FirefoxProfile fp = new FirefoxProfile();
      fp.setPreference("browser.privatebrowsing.autostart",true);

      FirefoxOptions fo = new FirefoxOptions();
      fo.setProfile(fp);

        WebDriver driver = new FirefoxDriver(fo);
        driver.get("https://www.google.co.in");
    }


}
