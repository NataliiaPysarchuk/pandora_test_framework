package pandora_tests.cl_6;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.visible;
import static enumes.BraceletSizes.LARGE;
import static enumes.BraceletSizes.MEDIUM;
import static page_object.HomePage.homePage;

public class CheckIfItemAddedToBasketTest extends BasedUiTest {

    @Test
    @Description("Check if item added to the basket ")
    @TmsLink("CL-6")
    public void testCheckIfItemAdded() {

        homePage()
                .goToShop()
                .goToMenuBracelets()
                .goToGoldSnitchPage()
                .chooseSize(LARGE)
                .addItemToBasket()
                .getGoldSnitchBracelet()
                .waitUntil(visible, 5000)
                .shouldHave(matchText("Золотий снич"));
    }
}
