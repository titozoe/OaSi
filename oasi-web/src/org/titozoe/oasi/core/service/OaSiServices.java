package org.titozoe.oasi.core.service;

import org.titozoe.oasi.core.service.impl.CoreProfileService;


public class OaSiServices {
	
	
	private static ProfileService profileService = new CoreProfileService();

	public static ProfileService getProfileService() {
		return profileService;
	}


}
