package org.titozoe.oasi.core.domain.comparators;

import java.util.Comparator;

import org.titozoe.oasi.core.domain.Profession;

public class ProfessionByName implements Comparator<Profession> {

	@Override
	public int compare(Profession p1, Profession p2) {		
		return p1.getName().compareToIgnoreCase(p2.getName());
	}

}
