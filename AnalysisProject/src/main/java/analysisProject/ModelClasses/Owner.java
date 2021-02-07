package analysisProject.ModelClasses;
import java.util.*;

public class Owner {

	public Owner() {
	}

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String email;
	private Association association;
	
	public Association getAssociation() {
		return association;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}

	private Set<Farm> farms = new HashSet<Farm>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fname) {
		firstName = fname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lname) {
		lastName = lname;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFarms(Set<Farm> farms) {
		this.farms = farms;
	}

	public void addFarm(Farm farm) {
		this.farms.add(farm);
	}

	public Set<Farm> getFarms() {
		return farms;
	}

	public void removeFarm(Farm farm) {
		farms.remove(farm);
	}

}