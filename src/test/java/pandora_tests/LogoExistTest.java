package pandora_tests;

import static com.codeborne.selenide.Condition.visible;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Selenide.$;

public class LogoExistTest extends BasedUiTest {

    @Test
    public void testLogoExist() {
        $("").shouldBe(visible);
    }
}
