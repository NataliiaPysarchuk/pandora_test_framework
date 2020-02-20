package pandora_tests.cl_5;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.matchText;
import static page_object.HomePage.homePage;

public class CarePageTest extends BasedUiTest {

    @Test
    @Description("Check the number of elements on the page")
    @TmsLink("CL-5")
    public void testCheckNumberOfElementsOnPage() {

        homePage()
                .goToShop()
                .goToMenuCare()
                .getListOfCareItemsOnPage()
                .shouldHaveSize(2);
    }

    @Test
    @Description("Check the names of elements on the page")
    public void testCheckNameOfCareSet() {

        homePage()
                .goToShop()
                .goToMenuCare()
                .goToCareSetPage()
                .getNameOfCareSet()
                .shouldHave(matchText("Набір для догляду"));
    }

    @Test
    public void testCheckNameOfSwitchForJewelry() {

        homePage()
                .goToShop()
                .goToMenuCare()
                .goToSwitchForJewelryPage()
                .getNameOfSwitchForJewelry()
                .shouldHave(matchText("Відмикач для браслетів"));
    }

    @Test
    @Description("Check the price of elements on the page")
    public void testCheckPriceOfCareSet() {

        homePage()
                .goToShop()
                .goToMenuCare()
                .goToCareSetPage()
                .getPriceOfCareSet()
                .shouldHave(exactText("595 грн"));
    }

    @Test
    public void testCheckPriceOfSwitchForJewelry() {

        homePage()
                .goToShop()
                .goToMenuCare()
                .goToSwitchForJewelryPage()
                .getPriceOfSwitchForJewelry()
                .shouldHave(exactText("995 грн"));
    }
}
