package analysisProject.ModelClasses;

import java.util.*;

public class Farm {

	public Farm() {
	}

	private String idNumber;
	private String location;
	private Owner owners;
	private Set<Cow> cows = new HashSet<Cow>();

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Cow> getCows() {
		return cows;
	}

	public void setCows(Set<Cow> cows) {
		this.cows = cows;
	}

	public Owner getOwners() {
		return owners;
	}

	public void setOwners(Owner owners) {
		this.owners = owners;
	}

	public void addCow(Cow cow) {
		cows.add(cow);
	}

	public void removeCow(Cow cow) {
		cows.remove(cow);
	}

}