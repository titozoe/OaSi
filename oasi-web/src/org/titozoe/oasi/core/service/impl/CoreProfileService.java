package org.titozoe.oasi.core.service.impl;

import java.util.List;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.oasi.core.domain.Profile;
import org.titozoe.oasi.core.persistence.OaSiPersistence;
import org.titozoe.oasi.core.persistence.ProfileDao;
import org.titozoe.oasi.core.service.ProfileService;

public class CoreProfileService implements ProfileService {
	
	private ProfileDao profileDao = OaSiPersistence.getProfileDao();

	@Override
	public void add(Profile profile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Profile profile) {
		// TODO Auto-generated method stub

	}

	@Override
	public Profile fetch(int profileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile delete(int profileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> search(Profile profile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Profile> searchBy(Profession profession) {
		return profileDao.searchBy(profession);
	}

}
