package definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;
public class SingleChoiceQuestionOptions_vasiliyStepsDefs {
    @Then("error message {string} is displayed")
    public void errorMessageIsDisplayed(String expError) {
//        String actError = getDriver().findElement(By.xpath("//mat-error[@id='mat-error-1']")).getText();
//        assertThat(actError.contains(expError)).isTrue();

        String actErrorMessage = getDriver().findElement(By.xpath("//mat-error[contains(text(),'Quiz is not completed')]/../..")).getText();
        System.out.println(actErrorMessage);
        assertThat(actErrorMessage.contains(expError)).isTrue();
    }
}
