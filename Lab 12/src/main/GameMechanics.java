package main;

import java.util.ArrayList;

public class GameMechanics {
	public static boolean BattleTester(ArrayList<? extends Character> list) {
		for (final Character ch : list)
			if (!(ch instanceof Hero))
				return false;
		return true;
	}

	public static void basicWinChances(Character c1, Character c2) {
		if (c1.getName().equals(c2.getName())) {
			System.out.println("Cannot fight itself!");
			return;
		}

		int h1 = c1.getHearts(), h2 = c2.getHearts();
		int gcd = gcd(h1, h2);
		Character winner = h1 == h2 ? null : h1 > h2 ? c1 : c2;
		h1 /= gcd;
		h2 /= gcd;
		System.out.println("Ratio:\t" + h1 + " to " + h2);
		System.out.println("Winner:\t" + (winner == null ? "None" : winner.getName()));
	}

	public static void advancedWinChances(Character c1, Character c2) {
		Hero h1 = null, h2 = null;
		if (c1 instanceof Hero)
			h1 = (Hero) c1;
		if (c2 instanceof Hero)
			h2 = (Hero) c2;
		if (h1 != null && h2 != null) {
			System.out.println("Heros cannot fight each other");
			return;
		} if (c1.getName().equals(c2.getName())) {
			System.out.println("Cannot fight itself");
			return;
		}
		
		
		int ehp1 = 0;
		if (h1 != null) {
			ehp1 = h1.getHearts();
			ehp1 *= h1.getArmour() == 100 ? 1.5 : 1;
		} else
			ehp1 = c1.getHearts();
		
		
		int ehp2 = 0;
		if (h2 != null) {
			ehp2 = h2.getHearts();
			ehp2 *= h2.getArmour() == 100 ? 1.5 : 1;
		} else
			ehp2 = c2.getHearts();
		
		int gcd = gcd(ehp1, ehp2);
		Character winner = ehp1 == ehp2 ? null : ehp1 > ehp2 ? c1 : c2;
		ehp1 /= gcd;
		ehp2 /= gcd;
		System.out.println("Ratio:\t" + ehp1 + " to " + ehp2);
		System.out.println("Winner:\t" + (winner == null ? "None" : winner.getName()));
	}
	
	public static void sortedBattlefieldCharacters(ArrayList<Character> list) {
		System.out.println("Before Sort:\t");
		for (final Character c : list)
			System.out.println(c.toString());
		list.sort(new CharacterComp());
		System.out.println("After Sort:\t");
		for (final Character c : list)
			System.out.println(c.toString());
	}

	public static int gcd(int a, int b) {
		int i = a < b ? a : b;

		for (int j = i; j > 1; --j) {
			if (a % j == 0 && b % j == 0)
				return j;
		}

		return 1;
	}
}
