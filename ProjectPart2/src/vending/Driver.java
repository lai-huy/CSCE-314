package vending;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		DataFile testAllSameDrink = new DataFile("./Directory/sampleDir1.txt", "./Input/sampleInput1.txt");
		DataFile testAllDifferentDrinks = new DataFile("./Directory/sampleDir2.txt", "./Input/sampleInput2.txt");
		DataFile testAllSnacks = new DataFile("./Directory/sampleDir3.txt", "./Input/sampleInput3.txt");
		DataFile testEmptyMachine = new DataFile("./Directory/sampleDir4.txt", "./Input/sampleInput4.txt");

		ArrayList<DataFile> l = new ArrayList<>();
		l.add(testAllSameDrink);
		l.add(testAllDifferentDrinks);
		l.add(testAllSnacks);
		l.add(testEmptyMachine);

		/*
		 * For each of the files, load the vending machine with their contents and
		 * remove their contents subsequently, display the vending machine's contents
		 * before and after the unloading of items
		 */
		for (DataFile D : l) {
			ArrayList<String> V1 = D.loadDirectory();
			ArrayList<Integer> S1 = D.loadSampleInput();

			Vending myMachine = new Vending(V1);
			myMachine.displayItems();
			myMachine.unloadItems(S1);
			myMachine.displayItems();
			System.out.println("--------------------------------------------------");
		}

	}

}