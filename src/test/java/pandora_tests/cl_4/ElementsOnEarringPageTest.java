package pandora_tests.cl_4;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static page_object.HomePage.homePage;

public class ElementsOnEarringPageTest extends BasedUiTest {

    @Test
    @Description("Check the number of elements on the page")
    @TmsLink("CL-4")
    public void testCheckNumberOfElementsOnEarringsPage() {
        homePage()
                .goToShop()
                .goToMenuEarrings()
                .getListOfEarringsOnPage()
                .shouldHaveSize(30);
    }
}
