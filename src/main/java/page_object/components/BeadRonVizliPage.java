package page_object.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class BeadRonVizliPage {

    private SelenideElement priceOfRonVizliBead = $(By.xpath("//div[@class='prod-price']//span"));
    private SelenideElement nameOfRonVizliBead = $(By.xpath("//div[@class='prod-descr']/h1"));

}
