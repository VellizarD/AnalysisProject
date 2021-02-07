package analysisProject.ModelClasses;

import java.util.Date;

public class FemaleCow extends Cow {

	private Date lastBirthDate;

	public FemaleCow(String name, int age, Date lastBirthDate, String idNumber, /*
																				 * Farm farm, Set<Cow> children,
																				 * Set<Cow> parents,
																				 */
			Breed breed, Sex sex) {
		super(name, age, idNumber, /* farm, children, parents, */ Sex.Female, breed);
		this.lastBirthDate = lastBirthDate;

	}

	/*
	 * public void setChildren(Set<Cow> children) { this.children = children; }
	 * 
	 * public Set<Cow> getChildren() { return children; }
	 * 
	 * public void setParents(Set<Cow> parents) { this.parents = parents; }
	 * 
	 * public Set<Cow> getParents() { return parents; }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getLastBirthDate() {
		return lastBirthDate;
	}

	public void setLastBirthDate(Date date) {
		this.lastBirthDate = date;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String id) {
		this.idNumber = id;
	}

}
