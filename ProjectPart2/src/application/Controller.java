package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller {
	@FXML
	private Button slot0;

	@FXML
	private Button slot1;

	@FXML
	private Button slot2;

	@FXML
	private Button slot3;

	@FXML
	private Button slot4;

	@FXML
	private Button slot5;

	@FXML
	private Button slot6;

	@FXML
	private Button slot7;

	@FXML
	private void action(ActionEvent event) {
		System.out.println("Action");
	}

	@FXML
	private void buttonClicked(MouseEvent event) {
		System.out.println("Clicked");
	}
}
