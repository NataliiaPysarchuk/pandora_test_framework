package page_object;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import page_object.components.CareSetPage;
import page_object.components.SwitchForJewelryPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class CarePage {

    private SelenideElement careSet = $(By.xpath("//*[contains(text(),'Набір для догляду')]/preceding-sibling::a"));
    private SelenideElement switchForJewelry = $(By.xpath("//*[contains(text(),'Відмикач')]/preceding-sibling::a"));
    private ElementsCollection listOfCareItemsOnPage = $$(By.xpath("//div[@class='one-most gridder-list']"));

    public CareSetPage goToCareSetPage() {
        careSet.click();
        return new CareSetPage();
    }

    public SwitchForJewelryPage goToSwitchForJewelryPage() {
        switchForJewelry.click();
        return new SwitchForJewelryPage();
    }


}
