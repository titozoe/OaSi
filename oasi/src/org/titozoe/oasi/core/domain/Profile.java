package org.titozoe.oasi.core.domain;

import java.util.Date;
import java.util.List;

import org.titozoe.commons.domain.Entity;

public class Profile extends Entity {

	private static final long serialVersionUID = 2916471416086237183L;
	
	private String name;

	private String surname;
	private Date birthDate;
	
	private List<String> offeredServices;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<String> getOfferedServices() {
		return offeredServices;
	}

	public void setOfferedServices(List<String> offeredServices) {
		this.offeredServices = offeredServices;
	}

}
