package page_object;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class BasketPage {

    private SelenideElement goldSnitchBracelet = $(By.xpath("//div[@class='del-your-order-tit']/a"));


}
