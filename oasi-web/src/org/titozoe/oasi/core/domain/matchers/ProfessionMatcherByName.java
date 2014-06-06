package org.titozoe.oasi.core.domain.matchers;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.utils.Matcher;

public class ProfessionMatcherByName implements Matcher<Profession> {

	@Override
	public boolean match(Profession arg0, Profession arg1) {
		return arg0.getName().equalsIgnoreCase(arg1.getName());
	}

}
