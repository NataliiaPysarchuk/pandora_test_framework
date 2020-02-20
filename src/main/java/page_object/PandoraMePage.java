package page_object;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import page_object.components.BulavkaPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Getter
public class PandoraMePage {

    private ElementsCollection listOfPandoraMeBeads = $$(By.xpath("//div[@class='one-most gridder-list']"));
    private SelenideElement bulavka = $(By.xpath("(//div[@class='one-most-descr'])[1]/preceding-sibling::a"));


    public BulavkaPage goToBulavkaPage() {
        bulavka.click();
        return new BulavkaPage();
    }

}
