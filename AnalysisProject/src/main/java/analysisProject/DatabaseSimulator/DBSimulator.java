package analysisProject.DatabaseSimulator;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import analysisProject.ModelClasses.Breed;
import analysisProject.ModelClasses.Cow;
import analysisProject.ModelClasses.FemaleCow;
import analysisProject.ModelClasses.MaleCow;
import analysisProject.ModelClasses.Sex;

public class DBSimulator {
	@SuppressWarnings("deprecation")
	public static List<Cow> getCows(){
	 List<Cow> result = new ArrayList<Cow>();
	result.add(new FemaleCow("Ivanka",2,new Date(1990-1900,6,2),"fID1",Breed.Dexter,Sex.Female));
	result.add(new MaleCow("Ivan",3,"mID1",Breed.Dexter,Sex.Male));
	result.add(new FemaleCow("Gerda",3,new Date(1990-1900,5,7),"existingID",Breed.Dexter,Sex.Female));
	result.add(new FemaleCow("Penka",1,new Date(1990-1900,6,2),"fID2",Breed.Dexter,Sex.Female));
	result.add(new MaleCow("DJ",1,"mID2",Breed.Dexter,Sex.Male));
	result.add(new FemaleCow("Milka",2,new Date(2020-1900,6,2),"fID3",Breed.Dexter,Sex.Female));

	return result;
	}
}
