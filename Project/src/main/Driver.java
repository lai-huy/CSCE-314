package main;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //load data from file
	    DataFile myData = new DataFile("./Directory/directory1.txt", "./Input/input.txt");
	    myData.LoadDirectory();
	    myData.LoadSampleInput();

	    //initialize Vending machine with loaded data
	    ArrayList <String> myVending = myData.GetDirectory();
	    ArrayList <Integer> mySelections = myData.GetSelections(); // YES INTEGER, not int. Why??? ;)

	    Vending myMachine = new Vending(myVending);
	    // Test line to show items before removing initially
	    // System.out.println("Items originally there:");
	    // myMachine.DisplayItems(); //debug helper function, REALLY NEEDS toString()
	    // System.out.println("______________________________");
	    //remove items
	    // System.out.println("Items removed final count: ");
	    myMachine.UnloadItems(mySelections);

	    //Final output to display after removing
	    myMachine.DisplayItems(); //debug helper function, REALLY NEEDS toString()

	    /*****************/
	    // Above DisplayItems() call is fine, but the Vending machine's deconstructor 
	    // should call that function since it's the LAST operation. Notice it could be
	    // done with a helper function that USES the toString()
	    // We will NOT call DisplayItems() in testing 
	    /*****************/
	}

}
