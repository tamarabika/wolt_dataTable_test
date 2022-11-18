package wolt.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static wolt.pages.Constants.BASE_URL;

/**
 * Class WorkContactPageSteps contains all steps page.
 */
public class WorkContactPageSteps extends BaseSteps {

    @Given("I am on Work contact page")
    public void iAmOnWorkContactPage() {
        open(BASE_URL);
        workContactPage.accCookies();
    }

    @When("I fill out a valid registration form header")
    public void iFillOutAValidRegistrationFormHeader(DataTable dataTable) {
        List<List<String>> signUpForms = dataTable.asLists(String.class);
        String email = signUpForms.get(0).get(0);
        String company = signUpForms.get(0).get(1);
        String companySize = signUpForms.get(0).get(2);
        String country = signUpForms.get(0).get(3);
        workContactPage.fillInDataFields(email, company, companySize, country);

    }

    @When("I click on Contact us button")
    public void iClickOnContactUsButton() {
        workContactFormPage = workContactPage.clickOnContactUsBtn();
    }


    @When("I fill out a registration form header")
    public void iFillOutARegistrationFormHeader() {
        workContactPage.fillInDataFieldsWithFaker();
    }

    @When("I fill out a registration form header with Faker")
    public void iFillOutARegistrationFormHeaderWithFaker() {
        workContactPage.fillInDataFieldsWithFaker2();
    }
}
