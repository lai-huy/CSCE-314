package main;

import java.util.Comparator;

public class CharacterComp implements Comparator<Character> {

	@Override
	public int compare(Character c1, Character c2) {
		Hero h1 = null, h2 = null;
		if (c1 instanceof Hero)
			h1 = (Hero) c1;
		if (c2 instanceof Hero)
			h2 = (Hero) c2;
		
		double ehp1 = 0d;
		if (h1 != null) {
			ehp1 = h1.getHearts();
			ehp1 *= h1.getArmour() == 100 ? 1.5 : 1;
		} else
			ehp1 = c1.getHearts();
		
		
		double ehp2 = 0d;
		if (h2 != null) {
			ehp2 = h2.getHearts();
			ehp2 *= h2.getArmour() == 100 ? 1.5 : 1;
		} else
			ehp2 = c2.getHearts();
		return Double.compare(ehp2, ehp1);
	}

}
