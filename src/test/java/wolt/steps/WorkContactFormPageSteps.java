package wolt.steps;

import io.cucumber.docstring.DocString;
import io.cucumber.java.en.Then;

/**
 * Class WorkContactFormPageSteps contains all steps page.
 */
public class WorkContactFormPageSteps extends BaseSteps {

    @Then("I see Work contact form page")
    public void iSeeWorkContactFormPage(DocString textWCFPage) {
        String text = textWCFPage.getContent();
        workContactFormPage.iSeeWCFPText(text);
    }

}
