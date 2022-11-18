package wolt.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Class WorkContactPage contains all locators and methods page.
 */
public class WorkContactPage extends Page {
    // locators
    protected static By emailField = By.xpath("//*[@id='mainContent']/div/div[1]/div/div/div/form/div[1]/div/div[1]/input");
    protected static By companyField = By.xpath("//*[@id='mainContent']/div/div[1]/div/div/div/form/div[2]/div/div[1]/input");
    protected static By companySizeField = By.xpath("//*[@id='mainContent']/div/div[1]/div/div/div/form/div[3]/div[1]/label/select");
    protected static By countryField = By.xpath("//*[@id='mainContent']/div/div[1]/div/div/div/form/div[3]/div[2]/label/select");
    protected static By contactUsBtn = By.xpath("//*[@id='mainContent']/div/div[1]/div/div/div/form/button[2]/div[3]");

    // methods
    public void fillInDataFields(String email, String company, String companySize, String country) {

        $(emailField).setValue(email);
        $(companyField).setValue(company);
        $(companySizeField).selectOption(companySize);
        $(countryField).selectOption(country);
    }

    public void fillInDataFieldsWithFaker() {

        $(emailField).setValue(faker.internet().emailAddress());
        $(companyField).setValue(faker.name().firstName());

    }


    public WorkContactFormPage clickOnContactUsBtn() {
        $(contactUsBtn).click();
        return page(WorkContactFormPage.class);

    }

    public void fillInDataFieldsWithFaker2() {
        String[] companySize = {"0-1", "2-10", "11-50", "51-200", "201-500", "501-1000", "1001-5000", "5001-10000", "10000+"};
        String[] country = {"Azerbaijan", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "Georgia", "Germany", "Greece", "Hungary", "Israel", "Japan", "Kazakhstan", "Latvia", "Lithuania", "Malta", "Norway", "Poland", "Serbia", "Slovakia", "Slovenia", "Sweden"};
        $(emailField).setValue(faker.internet().emailAddress());
        $(companyField).setValue(faker.name().firstName());
        $(companySizeField).selectOption(companySize[faker.random().nextInt(companySize.length)]);
        $(countryField).selectOption(country[faker.random().nextInt(country.length)]);
    }

}

