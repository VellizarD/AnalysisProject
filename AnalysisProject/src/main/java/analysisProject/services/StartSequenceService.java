package analysisProject.services;

import java.sql.Date;
import java.util.List;
import analysisProject.DatabaseSimulator.DBSimulator;
import analysisProject.ModelClasses.Cow;
import analysisProject.ModelClasses.FemaleCow;
import analysisProject.ModelClasses.MaleCow;

public class StartSequenceService {

	public static String start(String fID, String mID) {
		List<Cow> cows = DBSimulator.getCows();

		Cow mCow = cows.stream().filter(c -> c.getIdNumber().equals(mID)).findFirst().orElse(null);
		Cow fCow = cows.stream().filter(c -> c.getIdNumber().equals(fID)).findFirst().orElse(null);

		if (mCow.getClass().getSimpleName().equals("FemaleCow") && fCow.getClass().getSimpleName().equals("FemaleCow"))
			return "Втората въведена от вас крава трябва да е мъжка";

		if (mCow.getClass().getSimpleName().equals("MaleCow") && fCow.getClass().getSimpleName().equals("MaleCow"))
			return "Първата въведена от вас крава трябва да е женска";

		if (mCow.getClass().getSimpleName().equals("FemaleCow") && fCow.getClass().getSimpleName().equals("MaleCow"))
			return "Първата въведена от вас крава трябва да е женска, а втората- мъжка";

		MaleCow maleCow = (MaleCow) mCow;
		FemaleCow femaleCow = (FemaleCow) fCow;

		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		String dateNow = date.toString();

		int yearNow = Integer.parseInt(dateNow.substring(0, 4));
		int monthNow = Integer.parseInt(dateNow.substring(5, 7));
		String dateBirth = femaleCow.getLastBirthDate().toString();
		int yearBirth = Integer.parseInt(dateBirth.substring(0, 4));
		int monthBirth = Integer.parseInt(dateBirth.substring(5, 7));

		boolean hasTenMonthsPassed = false;
		if (yearNow - yearBirth > 2) {
			hasTenMonthsPassed = true;
		} else if (yearNow - yearBirth == 1 && 12 + (monthNow - monthBirth) > 10) {
			hasTenMonthsPassed = true;
		} else if (yearNow == yearBirth && monthNow - monthBirth > 10) {
			hasTenMonthsPassed = true;
		}
		if (!hasTenMonthsPassed) {
			return "Трябва да са минали поне 10 месеца от датата на последното забраменяване на женската крава";
		}

		if (maleCow.getAge() < 2) {
			return "Мъжката крава трябва да е на поне 2 години";
		}
		if (femaleCow.getAge() < 2) {
			return "Женската крава трябва да е на поне 2 години";
		}
		return "Успешно стартирахте процеса";
	}

}
