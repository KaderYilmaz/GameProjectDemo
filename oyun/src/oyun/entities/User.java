package oyun.entities;

import java.time.LocalDate;

public class User {
	int id;
	String firstName;
	String lastName;
	LocalDate birthYear;
	String tcNo;
	
	public User(int id, String firstName, String lastName, LocalDate birthYear, String tcNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.tcNo = tcNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(LocalDate birthYear) {
		this.birthYear = birthYear;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	
}
