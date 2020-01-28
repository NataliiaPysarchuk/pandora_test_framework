package util.runners;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BasedUiTest {

    @BeforeMethod
    public void setUp (){
        final String url = "http://www.google.com" ;

        Selenide.open(url);

    }
}
