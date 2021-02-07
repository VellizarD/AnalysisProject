package analysisProject.models;

import java.sql.Date;

import analysisProject.ModelClasses.Breed;
import analysisProject.ModelClasses.Sex;
import analysisProject.services.CreateCowService;

public class AddNewCowFormModel {

	private String name;
	private String idNumber;
	private Date lastBirthDate;
	private int age;
	private String message;
	private Sex sex;
	private Breed breed;

	public void navigateToCreateForm() {
		System.out.println("Навигирано е до формата за добавяне на нова крава!");
	}

	public void setCowName(String name) {
		this.name = name;

	}

	public void setCowLastBirthDate(String date) {
		if (date != null)
			lastBirthDate = Date.valueOf(date);
		else
			lastBirthDate = null;
	}

	public void setCowID(String id) {
		idNumber = id;

	}

	public void setCowAge(int age) {
		this.age = age;
	}

	public void clickCreateButton() {
		message = CreateCowService.create(name, idNumber, age, lastBirthDate, sex, breed);
	}

	public String getCreateMessage() {
		return message;
	}

	public void setCowSex(Sex sex) {
		this.sex = sex;

	}

	public void setCowBreed(Breed breed) {
		this.breed = breed;

	}

}
