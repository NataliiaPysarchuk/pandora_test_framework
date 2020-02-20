package page_object;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

@Getter
public class EarringsPage {

    private ElementsCollection listOfEarringsOnPage = $$(By.xpath("//div[@class='one-most gridder-list']"));
}
