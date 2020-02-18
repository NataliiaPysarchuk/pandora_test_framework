package pandora_tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.exactText;
import static page_object.HomePage.homePage;

public class PriceOfBulavkaTest extends BasedUiTest {

    @Test
    @Description("Check price of bulavka on PandoraMe Page")
    @TmsLink("CL-1")
    public void testPriceOfBulavka() {
        homePage()
                .goToShop()
                .goToPandoraMeMenu()
                .goToBulavkaPage()
                .getPriceOfBulavka()
                .shouldHave(exactText("595 грн"));
    }
}
