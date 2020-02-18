package page_object;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.val;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePage {

    private SelenideElement iShopButton = $(By.className("pandora-icon-basket"));
    private SelenideElement logoPandora = $(By.className("pandora-icon-logo-pandora"));

    @Step("Open home page")
    public static HomePage homePage() {
        val url = "https://www.pandora.net/uk-ua";

        Selenide.open(url);
        return new HomePage();
    }

    @Step("Go to shop page")
    public ShopPage goToShop() {
        iShopButton.click();
        return new ShopPage();
    }
}
