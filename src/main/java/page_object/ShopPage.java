package page_object;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ShopPage {

    private SelenideElement menuPresents = $(By.xpath("(//a[@href='/podarunki/'])[2]"));
    private SelenideElement menuPandoraMe = $(By.xpath("(//a[@href='/pandora_me/'])[2] "));
    private SelenideElement menuBracelets = $(By.xpath("(//a[@href='/brasleti/'])[2]"));
    private SelenideElement menuBeads = $(By.xpath("(//a[@href='/namistini/'])[2]"));
    private SelenideElement menuRings = $(By.xpath("(//a[@href='/kabluchki/'])[2]"));
    private SelenideElement menuEarrings = $(By.xpath("(//a[@href='/serezhki/'])[2]"));
    private SelenideElement menuNecklace = $(By.xpath("(//a[@href='/namisto/'])[2]"));
    private SelenideElement menuCare = $(By.xpath("(//a[@href='/doglyad/'])[2]"));
    private SelenideElement menuOutlet = $(By.xpath("(//a[@href='/outlet/'])[2]"));
    private SelenideElement searchField = $(By.id("head_search"));
    private SelenideElement searchFieldOpen = $(By.name("q"));
    private SelenideElement beadHarryPotter = $(By.xpath("//div[@class='one-most-descr']"));
    private SelenideElement basket = $(By.xpath("//div[@class='user-menu']/a[4]']"));


    public ShopPage searchFor(final String searchValue) {
        searchField.click();
        searchFieldOpen.setValue(searchValue).pressEnter();
        return this;
    }

    public PandoraMePage goToPandoraMeMenu() {
        menuPandoraMe.click();
        return new PandoraMePage();
    }

    public BraceletsPage goToMenuBracelets() {
        menuBracelets.click();
        return new BraceletsPage();
    }

    public BeadsPage goToMenuBeads() {
        menuBeads.click();
        return new BeadsPage ();
    }

    public EarringsPage goToMenuEarrings() {
        menuEarrings.click();
        return new EarringsPage ();
    }

    public CarePage goToMenuCare() {
        menuCare.click();
        return new CarePage();
    }

    public BasketPage goToBasketPage() {
        basket.click();
        return new BasketPage();
    }
}
