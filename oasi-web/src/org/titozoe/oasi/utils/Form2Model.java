package org.titozoe.oasi.utils;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.oasi.webserver.forms.SearchByProfession;

public abstract class Form2Model {
	
	public static Profession create(SearchByProfession searchByProfession){		
		Profession profession = new Profession();
		profession.setName(searchByProfession.getProfession());
		profession.setLevel(searchByProfession.getLevel());
		return profession;
	}

}
