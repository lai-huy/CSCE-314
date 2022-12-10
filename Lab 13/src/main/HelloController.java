package main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private int turnNumber = 0;
    private int blueWin = 0;
    private int greenWin = 0;
    @FXML
    private Label turnText, blueText, greenText;
    @FXML
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    @FXML
    private Button resetButton;

    @FXML
    protected void onResetButtonClick() {
        turnNumber = 0;
        turnText.setText("It's Blue's turn!");
        button1.setDisable(false);
        button2.setDisable(false);
        button3.setDisable(false);
        button4.setDisable(false);
        button5.setDisable(false);
        button6.setDisable(false);
        button7.setDisable(false);
        button8.setDisable(false);
        button9.setDisable(false);
        button1.setText("X/O");
        button2.setText("X/O");
        button3.setText("X/O");
        button4.setText("X/O");
        button5.setText("X/O");
        button6.setText("X/O");
        button7.setText("X/O");
        button8.setText("X/O");
        button9.setText("X/O");
        button1.setStyle(("-fx0background-color: #ff0000"));
        button2.setStyle(("-fx0background-color: #ff0000"));
        button3.setStyle(("-fx0background-color: #ff0000"));
        button4.setStyle(("-fx0background-color: #ff0000"));
        button5.setStyle(("-fx0background-color: #ff0000"));
        button6.setStyle(("-fx0background-color: #ff0000"));
        button7.setStyle(("-fx0background-color: #ff0000"));
        button8.setStyle(("-fx0background-color: #ff0000"));
        button9.setStyle(("-fx0background-color: #ff0000"));
    }

    private boolean checkWin(){
        if (button1.isDisabled() && button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()))
            return true;
        if (button4.isDisabled() && button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText()))
            return true;
        if (button7.isDisabled() && button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText()))
            return true;
        if (button1.isDisabled() && button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText()))
            return true;
        if (button2.isDisabled() && button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText()))
            return true;
        if (button3.isDisabled() && button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText()))
            return true;
        if (button1.isDisabled() && button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText()))
            return true;
        if (button3.isDisabled() && button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText()))
            return true;
        return false;
    }

    private void update(){
        if (checkWin()){
            button1.setDisable(true);
            button2.setDisable(true);
            button3.setDisable(true);
            button4.setDisable(true);
            button5.setDisable(true);
            button6.setDisable(true);
            button7.setDisable(true);
            button8.setDisable(true);
            button9.setDisable(true);
            // update scoreboard
            if(turnNumber%2 == 0){
                blueWin++;
                blueText.setText("Blue: " + blueWin);
                turnText.setText("Blue won!");
            }
            else{
                greenWin++;
                greenText.setText("Green: " + greenWin);
                turnText.setText("Green won!");
            }
        }
        else{
            if ((turnNumber+1)%2 == 0){
                turnText.setText("It's Blue's turn!");
            }
            else {
                turnText.setText("It's Green's turn!");
            }
        }
    }

    @FXML
    protected void onButton1Click() {
        if (turnNumber % 2 == 0) {
            button1.setText("X");
            button1.setStyle("-fx-background-color: #0000ff;");
            button1.setDisable(true);
        }
        else {
            button1.setText("O");
            button1.setStyle("-fx-background-color: #ffff00;");
            button1.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton2Click() {
        if (turnNumber % 2 == 0) {
            button2.setText("X");
            button2.setStyle("-fx-background-color: #0000ff;");
            button2.setDisable(true);
        }
        else {
            button2.setText("O");
            button2.setStyle("-fx-background-color: #ffff00;");
            button2.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton3Click() {
        if (turnNumber % 2 == 0) {
            button3.setText("X");
            button3.setStyle("-fx-background-color: #0000ff;");
            button3.setDisable(true);
        }
        else {
            button3.setText("O");
            button3.setStyle("-fx-background-color: #ffff00;");
            button3.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton4Click() {
        if (turnNumber % 2 == 0) {
            button4.setText("X");
            button4.setStyle("-fx-background-color: #0000ff;");
            button4.setDisable(true);
        }
        else {
            button4.setText("O");
            button4.setStyle("-fx-background-color: #ffff00;");
            button4.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton5Click() {
        if (turnNumber % 2 == 0) {
            button5.setText("X");
            button5.setStyle("-fx-background-color: #0000ff;");
            button5.setDisable(true);
        }
        else {
            button5.setText("O");
            button5.setStyle("-fx-background-color: #ffff00;");
            button5.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton6Click() {
        if (turnNumber % 2 == 0) {
            button6.setText("X");
            button6.setStyle("-fx-background-color: #0000ff;");
            button6.setDisable(true);
        }
        else {
            button6.setText("O");
            button6.setStyle("-fx-background-color: #ffff00;");
            button6.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton7Click() {
        if (turnNumber % 2 == 0) {
            button7.setText("X");
            button7.setStyle("-fx-background-color: #0000ff;");
            button7.setDisable(true);
        }
        else {
            button7.setText("O");
            button7.setStyle("-fx-background-color: #ffff00;");
            button7.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton8Click() {
        if (turnNumber % 2 == 0) {
            button8.setText("X");
            button8.setStyle("-fx-background-color: #0000ff;");
            button8.setDisable(true);
        }
        else {
            button8.setText("O");
            button8.setStyle("-fx-background-color: #ffff00;");
            button8.setDisable(true);
        }
        update();
        turnNumber++;
    }

    @FXML
    protected void onButton9Click() {
        if (turnNumber % 2 == 0) {
            button9.setText("X");
            button9.setStyle("-fx-background-color: #0000ff;");
            button9.setDisable(true);
        }
        else {
            button9.setText("O");
            button9.setStyle("-fx-background-color: #ffff00;");
            button9.setDisable(true);
        }
        update();
        turnNumber++;
    }
}