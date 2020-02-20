package pandora_tests.cl_2;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import util.runners.BasedUiTest;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.matchText;
import static page_object.HomePage.homePage;

public class PriceOfBraceletGoldSnitchTest extends BasedUiTest {

    @Test
    @Description ("Check the name of bracelet and price")
    @TmsLink("CL-2")
    public void testCheckPriceOfBraceletGoldSnitch(){
       homePage()
               .goToShop()
               .goToMenuBracelets()
               .goToGoldSnitchPage()
               .getPriceOfGoldSnitchBracelet()
               .shouldHave(exactText("2 995 грн"));
   }
   @Test
    public void testCheckNameOfBraceletGoldSnitch(){
       homePage()
               .goToShop()
               .goToMenuBracelets()
               .goToGoldSnitchPage()
               .getNameOfGoldSnitchBracelet()
               .shouldHave(matchText("Золотий снич"));
   }
}
