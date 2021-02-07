package analysisProject;

import static org.junit.Assert.assertEquals;

import analysisProject.models.StartMatingSequenceFormModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MatingSequenceSteps {
	StartMatingSequenceFormModel startMatingSequenceFormModel = new StartMatingSequenceFormModel();

	@Given("^Портебителя отваря екрана за Стартиране на процес по Чифтосване$")
	public void openMatingSequnceForm() throws Throwable {
		startMatingSequenceFormModel.navigateToMatingSequnceForm();
	}

	@When("^Въведе номер на женска крава \"([^\"]*)\"$")
	public void addFemaleCowId(String fID) throws Throwable {
		startMatingSequenceFormModel.setFemaleCowId(fID);
	}

	@When("^Въведе номер на мъжка крава \"([^\"]*)\"$")
	public void addMaleCowId(String mID) throws Throwable {
		startMatingSequenceFormModel.setMaleCowId(mID);
	}

	@When("^Натиска бутона за стартиране$")
	public void clickStartSequenceButton() throws Throwable {
		startMatingSequenceFormModel.clickStartButton();
	}

	@Then("^Вижда съобщението \"([^\"]*)\"$")
	public void checkStartMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, startMatingSequenceFormModel.getStartMessage());
	}
}
