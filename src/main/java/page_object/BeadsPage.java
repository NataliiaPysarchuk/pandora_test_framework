package page_object;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import page_object.components.BeadRonVizliPage;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class BeadsPage {

    private SelenideElement beadRonVizli = $(By.xpath("//*[contains(text(),'Рон Візлі')]/preceding-sibling::a"));

    public BeadRonVizliPage goToRonVizliPage() {
        beadRonVizli.click();
        return new BeadRonVizliPage();
    }

}
