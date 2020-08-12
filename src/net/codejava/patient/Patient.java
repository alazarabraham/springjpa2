package net.codejava.patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long patientid;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String password;
    

 
    protected Patient() {
    }
 
    protected Patient(String firstName, String lastName, String dob,String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

	public Long getPatientid() {
		return patientid;
	}

	public void setPatientid(Long patientid) {
		this.patientid = patientid;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


   
 
}
