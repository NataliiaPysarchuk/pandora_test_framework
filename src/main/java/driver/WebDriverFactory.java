package driver;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverFactory implements WebDriverProvider {

    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        return new ChromeDriver(options);
    }
}