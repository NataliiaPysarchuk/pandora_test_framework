package util.runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;

public class BasedUiTest {

    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
