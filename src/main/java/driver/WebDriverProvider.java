package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider implements com.codeborne.selenide.WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        return new ChromeDriver(options);
    }

}