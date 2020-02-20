package page_object.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class SwitchForJewelryPage {

    private SelenideElement priceOfSwitchForJewelry = $(By.xpath("//div[@class='prod-price']//span"));
    private SelenideElement nameOfSwitchForJewelry = $(By.xpath("//div[@class='prod-descr']/h1"));
}
