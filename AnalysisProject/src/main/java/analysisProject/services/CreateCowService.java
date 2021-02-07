package analysisProject.services;

import java.sql.Date;
import java.util.List;
import analysisProject.DatabaseSimulator.DBSimulator;
import analysisProject.ModelClasses.Breed;
import analysisProject.ModelClasses.Cow;
import analysisProject.ModelClasses.FemaleCow;
import analysisProject.ModelClasses.MaleCow;
import analysisProject.ModelClasses.Sex;

public class CreateCowService {

	public static String create(String name, String idNumber, int age, Date lastBirthDate, Sex sex, Breed breed) {
		final Cow Cow;
		if (sex == Sex.Male)
			Cow = new MaleCow(name, age, idNumber, breed, sex);
		else
			Cow = new FemaleCow(name, age, lastBirthDate, idNumber, breed, sex);
		List<Cow> cows = DBSimulator.getCows();

		boolean isNameEmpty = name.isEmpty();

		boolean isCowAgeValid = age > 0;

		boolean doesCowAlreadyExist = false;

		for (Cow c : cows) {
			if (c.getIdNumber().equals(idNumber))
				doesCowAlreadyExist = true;
		}

		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		String dateStr1 = date.toString();
		String year1 = dateStr1.substring(0, 4);
		String month1 = dateStr1.substring(5, 7);
		String dateStr2 = lastBirthDate.toString();
		String year2 = dateStr2.substring(0, 4);
		String month2 = dateStr2.substring(5, 7);
		boolean isLastBirthDateValid = false;
		if (Integer.parseInt(year2) - Integer.parseInt(year1) > age)
			isLastBirthDateValid = false;
		else if (Integer.parseInt(year2) > Integer.parseInt(year1)
				|| (Integer.parseInt(year1) == Integer.parseInt(year2)
						&& Integer.parseInt(month2) > Integer.parseInt(month1)))
			isLastBirthDateValid = false;
		else if (Integer.parseInt(year1) - Integer.parseInt(year2) > 2)
			isLastBirthDateValid = true;
		else if (Integer.parseInt(year1) - Integer.parseInt(year2) == 0)
			isLastBirthDateValid = Math.abs(Integer.parseInt(month1) - Integer.parseInt(month2)) > 10;

		if (isNameEmpty)
			return "Моля Въведете име на Кравата";
		if (!isCowAgeValid)
			return "Възрастта на кравата е невалидна";
		if (doesCowAlreadyExist)
			return "Крава с този идентификационен номер вече съществува в системата";
		if (!isLastBirthDateValid)
			return "Датата на последно раждане е невалидна";
		cows.add(Cow);
		return cows.contains(Cow) ? "Успешно добавихте нова крава" : "";
	}

}