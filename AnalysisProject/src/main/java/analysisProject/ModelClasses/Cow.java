package analysisProject.ModelClasses;

public abstract class Cow {

	protected String name;
	protected int age;
	protected String idNumber;
	protected Farm farm;
	// protected Set<Cow> children = new HashSet<Cow>();
	// protected Set<Cow> parents = new HashSet<Cow>();
	protected Sex sex;
	protected Breed breed;

	public Cow(String name, int age, String idNumber, /*
														 * Farm farm, Set<Cow> children, Set<Cow> parents,
														 */ Sex sex, Breed breed) {
		super();
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		// this.farm = farm;
		// this.children = children;
		// this.parents = parents;
		this.sex = sex;
		this.breed = breed;
	}

	public abstract String getIdNumber();

}
