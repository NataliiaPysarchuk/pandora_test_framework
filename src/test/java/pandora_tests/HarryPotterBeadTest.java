package pandora_tests;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.exactText;
import static page_object.HomePage.homePage;

public class HarryPotterBeadTest extends BasedUiTest {

    @Test
    @Description("Test verified weather menu beads exist")
    @TmsLink("TC-01")
    public void testBeadHarryPotter() {
        homePage()
                .goToShop()
                .searchFor("Гаррі Поттер")
                .getBeadHarryPotter()
                .shouldHave(exactText("Намистина Гаррі Поттер"));
    }
}
