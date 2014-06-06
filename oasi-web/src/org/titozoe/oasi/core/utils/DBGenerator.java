package org.titozoe.oasi.core.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.oasi.core.domain.Profile;


public class DBGenerator {
	
	private static List<Profile> profiles = new ArrayList<Profile>();
	private static List<Profession> professions = new ArrayList<Profession>();
	
	public static List<Profile> getProfiles() {
		return profiles;
	}

	public static List<Profession> getProfessions() {
		return professions;
	}

	public static void generateDB(){
				
		Calendar cal = Calendar.getInstance();
		
		Profile pfl; 
		Profession pfn;
		
		// ******** Michele **********
		pfl = new Profile();
		pfl.setId(1);
		pfl.setName("Michele");
		pfl.setSurname("Topini");
		
		cal.set(Calendar.DAY_OF_MONTH, 8);
		cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
		cal.set(Calendar.YEAR, 1985);		
		pfl.setBirthDate(new Date (cal.getTimeInMillis()));
		
		cal.set(Calendar.DAY_OF_MONTH, 25);
		cal.set(Calendar.MONTH, Calendar.MAY);
		cal.set(Calendar.YEAR, 2014);		
		
		pfl.setRegisteredSince(new Date(cal.getTimeInMillis()));
		
		pfn = new Profession();
		pfn.setId(1);
		pfn.setName("Fotografo");
		pfn.setLevel("JUNIOR");
		
		professions.add(pfn);
		pfl.setProfession(pfn);
		profiles.add(pfl);
		
		//********** Tito **************
		
		pfl = new Profile();
		pfl.setId(2);
		pfl.setName("Tito Zoe");
		pfl.setSurname("Chiacchiera");
		
		cal.set(Calendar.DAY_OF_MONTH, 16);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.YEAR, 1984);		
		pfl.setBirthDate(new Date (cal.getTimeInMillis()));
		
		cal.set(Calendar.DAY_OF_MONTH, 25);
		cal.set(Calendar.MONTH, Calendar.MAY);
		cal.set(Calendar.YEAR, 2014);		
		
		pfl.setRegisteredSince(new Date(cal.getTimeInMillis()));
		
		pfn = new Profession();
		pfn.setId(2);
		pfn.setName("Programmatore");
		pfn.setLevel("JUNIOR");

		professions.add(pfn);
		pfl.setProfession(pfn);
		profiles.add(pfl);
		
		
	}

}
