package pandora_tests;

import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.visible;
import static page_object.HomePage.homePage;

public class LogoExistTest extends BasedUiTest {

    @Test
    public void testLogoExist() {
        homePage()
                .getLogoPandora()
                .shouldBe(visible);

    }
}
