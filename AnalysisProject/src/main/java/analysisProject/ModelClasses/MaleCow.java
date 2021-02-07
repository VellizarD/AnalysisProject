package analysisProject.ModelClasses;

public class MaleCow extends Cow {

	public MaleCow(String name, int age, String idNumber, /* Farm farm, Set<Cow> children, Set<Cow> parents, */
			Breed breed, Sex sex) {
		super(name, age, idNumber, /* farm ,children, parents, */ Sex.Male, breed);

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
