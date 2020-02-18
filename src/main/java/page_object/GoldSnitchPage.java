package page_object;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class GoldSnitchPage {

    private SelenideElement priceOfGoldSnitchBracelet = $(By.xpath("//div[@class='prod-price']//span"));
    private SelenideElement nameOfGoldSnitchBracelet = $(By.xpath("//div[@class='prod-descr']/h1"));
}
