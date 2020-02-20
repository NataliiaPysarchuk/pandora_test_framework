package page_object;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import page_object.components.GoldSnitchPage;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class BraceletsPage {

    private SelenideElement braceletGoldSnitch = $(By.xpath("(//div[@class='one-most-descr'])[4]/preceding-sibling::a"));

    public GoldSnitchPage goToGoldSnitchPage() {
        braceletGoldSnitch.click();
        return new GoldSnitchPage();
    }

}
