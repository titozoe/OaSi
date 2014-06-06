package org.titozoe.oasi.core.domain;

import org.titozoe.commons.domain.Entity;

public class Profession extends Entity {

	private static final long serialVersionUID = -785274722967855401L;
	
	private String name;
	
	private String level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
