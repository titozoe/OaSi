package org.titozoe.oasi.core.persistence;

import java.util.List;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.oasi.core.domain.Profile;

public interface ProfileDao {
	
	// Classic CRUD operations
	
	public void add(Profile profile);

	public void edit(Profile profile);
	
	public Profile fetch(int profileId);

	public Profile delete(int profileId);

	public List<Profile> search(Profile profile);

	public List<Profile> list();
	
	public int count();	
	
	// Application function point operations
	
	public List<Profile> searchBy(Profession profession);

}
