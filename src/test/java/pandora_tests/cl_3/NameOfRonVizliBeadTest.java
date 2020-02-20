package pandora_tests.cl_3;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.matchText;
import static page_object.HomePage.homePage;

public class NameOfRonVizliBeadTest extends BasedUiTest {

    @Test
    @Description("Check the name of bead and price")
    @TmsLink("CL-3")
    public void testCheckPriceOfRonVizliBead() {
        homePage()
                .goToShop()
                .goToMenuBeads()
                .goToRonVizliPage()
                .getPriceOfRonVizliBead()
                .shouldHave(exactText("1 895 грн"));
    }

    @Test
    public void testCheckNameOfRonVizliBead() {
        homePage()
                .goToShop()
                .goToMenuBeads()
                .goToRonVizliPage()
                .getNameOfRonVizliBead()
                .shouldHave(matchText("Рон Візлі"));
    }
}



