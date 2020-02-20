package page_object.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class BulavkaPage {

    private SelenideElement priceOfBulavka = $(By.xpath("//div[@class='prod-price']//span"));

//    public SelenideElement bulavkaPrice() {
//       return priceOfBulavka;
//
//    }
}
