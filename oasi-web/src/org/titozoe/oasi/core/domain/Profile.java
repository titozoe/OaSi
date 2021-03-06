package org.titozoe.oasi.core.domain;

import java.util.Date;
import java.util.List;

import org.titozoe.commons.domain.Entity;

public class Profile extends Entity {

	private static final long serialVersionUID = 2916471416086237183L;
	
	protected String name;

	protected String surname;
	protected Date birthDate;
	protected Profession profession;
	
	protected Date registeredSince;
	
	
	private List<String> offeredServices;
	private List<String> searchedServices;

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

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public Date getRegisteredSince() {
		return registeredSince;
	}

	public void setRegisteredSince(Date registeredSince) {
		this.registeredSince = registeredSince;
	}

	public List<String> getOfferedServices() {
		return offeredServices;
	}

	public void setOfferedServices(List<String> offeredServices) {
		this.offeredServices = offeredServices;
	}

	public List<String> getSearchedServices() {
		return searchedServices;
	}

	public void setSearchedServices(List<String> searchedServices) {
		this.searchedServices = searchedServices;
	}

}
