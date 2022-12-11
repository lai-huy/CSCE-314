package application;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import vending.DataFile;
import vending.Vending;

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
	private Button load;

	@FXML
	private Button reset;

	@FXML
	private Label slot0_quantity;

	@FXML
	private Label slot1_quantity;

	@FXML
	private Label slot2_quantity;

	@FXML
	private Label slot3_quantity;

	@FXML
	private Label slot4_quantity;

	@FXML
	private Label slot5_quantity;

	@FXML
	private Label slot6_quantity;

	@FXML
	private Label slot7_quantity;

	private DataFile df;
	private Vending machine;

	@FXML
	private void slot0(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(0);
		this.updateLabels();
	}

	@FXML
	private void slot1(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(1);
		this.updateLabels();
	}

	@FXML
	private void slot2(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(2);
		this.updateLabels();
	}

	@FXML
	private void slot3(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(3);
		this.updateLabels();
	}

	@FXML
	private void slot4(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(4);
		this.updateLabels();
	}

	@FXML
	private void slot5(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(5);
		this.updateLabels();
	}

	@FXML
	private void slot6(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(6);
		this.updateLabels();
	}

	@FXML
	private void slot7(MouseEvent event) {
		if (this.machine == null) {
			System.out.println("The machine is empty :(");
			return;
		}

		this.machine.unloadItem(7);
		this.updateLabels();
	}

	@FXML
	private void loadFile(MouseEvent event) {
		FileChooser fchooser = new FileChooser();
		fchooser.setInitialDirectory(new File("./"));
		File dir = fchooser.showOpenDialog(null);
		if (dir == null) {
			System.out.println("No file selected");
			return;
		} else if (!dir.exists()) {
			System.out.println("No file selected");
			return;
		}
		this.df = new DataFile(dir);
		this.reset(event);

	}

	@FXML
	private void reset(MouseEvent event) {
		if (this.df == null) {
			System.out.println("Data File not selected");
			return;
		}

		this.machine = new Vending(this.df.loadDirectory());
		this.updateButtons();
		this.updateLabels();
	}

	private void updateButtons() {
		this.slot0.setText(this.machine.getItemInSlot(0));
		this.slot1.setText(this.machine.getItemInSlot(1));
		this.slot2.setText(this.machine.getItemInSlot(2));
		this.slot3.setText(this.machine.getItemInSlot(3));
		this.slot4.setText(this.machine.getItemInSlot(4));
		this.slot5.setText(this.machine.getItemInSlot(5));
		this.slot6.setText(this.machine.getItemInSlot(6));
		this.slot7.setText(this.machine.getItemInSlot(7));
	}

	private void updateLabels() {
		final int[] quant = this.machine.getQuantity();
		this.slot0_quantity.setText(Integer.toString(quant[0]));
		this.slot1_quantity.setText(Integer.toString(quant[1]));
		this.slot2_quantity.setText(Integer.toString(quant[2]));
		this.slot3_quantity.setText(Integer.toString(quant[3]));
		this.slot4_quantity.setText(Integer.toString(quant[4]));
		this.slot5_quantity.setText(Integer.toString(quant[5]));
		this.slot6_quantity.setText(Integer.toString(quant[6]));
		this.slot7_quantity.setText(Integer.toString(quant[7]));
	}
}
