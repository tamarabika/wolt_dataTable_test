package wolt.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Class WorkContactFormPage contains all locators and methods page.
 */
public class WorkContactFormPage extends Page {
    // locators
    protected static By textWCFPage = By.xpath("//*[@id='mainContent']/div/div[1]/div/div/div/h1");

    // methods
    public void iSeeWCFPText(String text) {

        $(textWCFPage).shouldHave(Condition.text(text));

    }
}
