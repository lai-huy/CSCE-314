package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Block testBlock = new Block("copper", new Location(0, 0, 0), 10);
//		System.out.println(testBlock);
		
		// Character textCharacter = new Character
		// good, just checking, but since Character is abstract, can't create an instance
		
		Villain testVillain = new Villain("Creeper", new Location(0, 1, 0), false, "axe", 10);
//		System.out.println(testVillain);

		
		Hero testHero = new Hero("Bowen", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 10, 100) ;
//		System.out.println(testHero);

		ArrayList<Character> BattleRoyale = new ArrayList<Character>();
//		BattleRoyale.add(testBlock); // won't work!! (Thankfully)
//		BattleRoyale.add(testVillain);
//		BattleRoyale.add(testHero);
//		System.out.println("Printing the mother of all battles");
//		System.out.println(BattleRoyale.toString());
//		System.out.println(GameMechanics.BattleTester(BattleRoyale));
		
		ArrayList<Hero> heros = new ArrayList<>();
		heros.add(new Hero("Aero", new Location(0, 0, 0), Arrays.asList("Cheese"), 5, 0));
		heros.add(new Hero("Bero", new Location(0, 0, 0), Arrays.asList("Cheese"), 5, 100));
		heros.add(new Hero("Cero", new Location(0, 0, 0), Arrays.asList("Cheese"), 10, 0));
		heros.add(new Hero("Dero", new Location(0, 0, 0), Arrays.asList("Cheese"), 10, 100));
		heros.add(new Hero("Eero", new Location(0, 0, 0), Arrays.asList("Cheese"), 15, 0));
//		System.out.println(GameMechanics.BattleTester(heros));
		
		ArrayList<Villain> villans = new ArrayList<>();
		villans.add(new Villain("Aillan", new Location(0, 0, 0), false, "Item", 5));
		villans.add(new Villain("Billan", new Location(0, 0, 0), false, "Item", 10));
		villans.add(new Villain("Cillan", new Location(0, 0, 0), false, "Item", 15));
		villans.add(new Villain("Dillan", new Location(0, 0, 0), false, "Item", 20));
		villans.add(new Villain("Eillan", new Location(0, 0, 0), false, "Item", 25));
//		System.out.println(GameMechanics.BattleTester(villans));
		
		ArrayList<Block> blocks = new ArrayList<>();
		blocks.add(new Block("A", new Location(0, 0 , 0), Integer.MAX_VALUE));
		blocks.add(new Block("B", new Location(0, 0 , 0), Integer.MAX_VALUE));
		blocks.add(new Block("C", new Location(0, 0 , 0), Integer.MAX_VALUE));
		blocks.add(new Block("D", new Location(0, 0 , 0), Integer.MAX_VALUE));
		blocks.add(new Block("E", new Location(0, 0 , 0), Integer.MAX_VALUE));
//		System.out.println(GameMechanics.BattleTester(blocks));*/
		
//		GameMechanics.sortedBattlefieldCharacters(blocks);
		
		ArrayList<Character> battle = new ArrayList<>();
		battle.addAll(heros);
		battle.addAll(villans);
		
		GameMechanics.sortedBattlefieldCharacters(battle);
		
	}
}
