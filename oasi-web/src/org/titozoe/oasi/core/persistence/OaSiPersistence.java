package org.titozoe.oasi.core.persistence;

import org.titozoe.oasi.core.persistence.impl.DemoProfileDao;

public class OaSiPersistence {
	
	private static ProfileDao profileDao = new DemoProfileDao();

	public static ProfileDao getProfileDao() {
		return profileDao;
	}
	
	

}
