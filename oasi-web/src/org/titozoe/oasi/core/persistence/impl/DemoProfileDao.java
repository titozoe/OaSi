package org.titozoe.oasi.core.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.oasi.core.domain.Profile;
import org.titozoe.oasi.core.domain.matchers.ProfessionMatcherByName;
import org.titozoe.oasi.core.persistence.ProfileDao;

public class DemoProfileDao implements ProfileDao {
	
	private static List<Profile> profiles = new ArrayList<Profile>();

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
	
	
	///

	private static ProfessionMatcherByName professionMatcherByName = new ProfessionMatcherByName();
	
	@Override
	public List<Profile> searchBy(Profession profession) {
		
		List<Profile> result = new ArrayList<Profile>(); 
		
		for (Profile pfl : profiles){
			
			if (professionMatcherByName.match(pfl.getProfession(), profession)){
				result.add(pfl);
			}
			
		}
		
		return result;
	}
	
}
