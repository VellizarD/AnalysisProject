package analysisProject;

import static org.junit.Assert.assertEquals;

import analysisProject.ModelClasses.Breed;
import analysisProject.ModelClasses.Sex;
import analysisProject.models.AddNewCowFormModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewCowSteps {
	AddNewCowFormModel addNewCowFormModel = new AddNewCowFormModel();

	@Given("^Потребителя отваря екрана за Добавяне на нова Крава$")
	public void openAddNewCowForm() throws Throwable {
		addNewCowFormModel.navigateToCreateForm();
	}

	@When("^Въведе име на Крава \"([^\"]*)\"$")
	public void addCowName(String name) throws Throwable {
		addNewCowFormModel.setCowName(name);
	}

	@When("^Въведе възраст на Крава \"([^\"]*)\"$")
	public void addCowAge(int age) throws Throwable {
		addNewCowFormModel.setCowAge(age);
	}

	@When("^Въведе пол на крава \"([^\"]*)\"$")
	public void addCowSex(Sex sex) throws Throwable {
		addNewCowFormModel.setCowSex(sex);
	}

	@When("^Въведе дата на последно раждане на Крава \"([^\"]*)\"$")
	public void addCowLastBirthDate(String date) throws Throwable {
		if (date.isEmpty() || date.equals(null))
			date = "1970-01-01";
		addNewCowFormModel.setCowLastBirthDate(date);
	}

	@When("^Въведе идентификационен номер на Крава \"([^\"]*)\"$")
	public void addCowID(String id) throws Throwable {
		addNewCowFormModel.setCowID(id);
	}

	@When("^Въведе порода на Крава \"([^\"]*)\"$")
	public void addCowBreed(Breed breed) throws Throwable {
		addNewCowFormModel.setCowBreed(breed);
	}

	@When("^Натиска бутона за Добавяне на нова Крава$")
	public void clickCreateNewCowButton() throws Throwable {
		addNewCowFormModel.clickCreateButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkCreateMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, addNewCowFormModel.getCreateMessage());
	}
}
