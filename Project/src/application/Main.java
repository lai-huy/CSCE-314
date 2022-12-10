package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import vending.DataFile;
import vending.Vending;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // load data from file
        DataFile myData = new DataFile("./Directory/directory1.txt", "./Input/input.txt");

        // initialize Vending machine with loaded data
        ArrayList<String> myVending = myData.loadDirectory();
        ArrayList<Integer> mySelections = myData.loadSampleInput();

        Vending myMachine = new Vending(myVending);
        // Test line to show items before removing initially
         System.out.println("Items originally there:");
         myMachine.displayItems(); //debug helper function, REALLY NEEDS toString()
         System.out.println("______________________________");
        // remove items
         System.out.println("Items removed final count: ");
        myMachine.unloadItems(mySelections);

        // Final output to display after removing
        myMachine.displayItems(); // debug helper function, REALLY NEEDS toString()

        /*****************/
        // Above DisplayItems() call is fine, but the Vending machine's deconstructor
        // should call that function since it's the LAST operation. Notice it could be
        // done with a helper function that USES the toString()
        // We will NOT call DisplayItems() in testing
        /*****************/
        
		launch(args);
	}
}
