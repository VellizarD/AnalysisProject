package analysisProject.ModelClasses;

import java.util.*;

public class Association {

	public Association() {
	}

	private String name;
	private int idNumber;
	private String officeAddress;
	private Set<Owner> owners = new HashSet<Owner>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfficeAddress(String address) {
		this.officeAddress = address;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setIdNumber(int id) {
		this.idNumber = id;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public Set<Owner> getOwners() {
		return owners;
	}

	public void setOwners(Set<Owner> owners) {
		this.owners = owners;
	}

	public void addOwner(Owner owner) {
		owners.add(owner);
	}

	public void removeOwner(Owner owner) {
		owners.remove(owner);
	}

}