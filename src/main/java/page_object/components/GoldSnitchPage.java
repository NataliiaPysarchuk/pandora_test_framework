package page_object.components;

import com.codeborne.selenide.SelenideElement;
import enumes.BraceletSizes;
import lombok.Getter;
import org.openqa.selenium.By;
import page_object.BasketPage;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

@Getter
public class GoldSnitchPage {

    private SelenideElement priceOfGoldSnitchBracelet = $(By.xpath("//div[@class='prod-price']//span"));
    private SelenideElement nameOfGoldSnitchBracelet = $(By.xpath("//div[@class='prod-descr']/h1"));
    private SelenideElement dropdownChooseSize = $(By.xpath("//div[@class='prod-size']"));
    private SelenideElement chooseSize19 = $(By.xpath("//div[@class='prod-size']//li[contains(text(),'19')]"));
    private String chooseSize = "//div[@class='prod-size']//li[contains(text(),'%s')]";
    private SelenideElement buttonAddToBasket = $(By.xpath("(//div[@class='item-cat-bay'])/a[1]"));
    private SelenideElement buttonToOrder = $(By.xpath("//div[@class='modal-bask-bt']/a"));

    public GoldSnitchPage chooseSize19() {
        dropdownChooseSize.click();
        chooseSize19.click();
        return this;
    }

    public GoldSnitchPage chooseSize(final BraceletSizes braceletSize) {
        dropdownChooseSize.click();
        $(By.xpath(format(chooseSize, braceletSize.getSize()))).click();
        return this;
    }

    public BasketPage addItemToBasket () {
        buttonAddToBasket.click();
        buttonToOrder.click();
        return new BasketPage ();
    }

}
