package page_object.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CareSetPage {

    private SelenideElement priceOfCareSet = $(By.xpath("//div[@class='prod-price']//span"));
    private SelenideElement nameOfCareSet = $(By.xpath("//div[@class='prod-descr']/h1"));
}
