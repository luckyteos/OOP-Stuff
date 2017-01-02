package controller;

import java.io.IOException;

import application.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BankInitialInterfaceController {
	@FXML
	private RadioButton DepositButton;
	@FXML
	private RadioButton WithdrawButton;
	@FXML
	private RadioButton leaveBankButton;
	
	// Main Application reference
	private MainApp mainApp;
	
	private Stage stage;
	private Stage bankDialogStage;
	private boolean deposit = false;
	
	public void handleDeposit (ActionEvent event) {
		
		try {
			//Load FXML files
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/Tiles/Bank/confirmationBank.fxml"));
			AnchorPane depositPane = (AnchorPane) loader.load();
			
			Scene scene = new Scene (depositPane);
			bankDialogStage.setScene(scene);
			bankDialogStage.show();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	public void handleWithdraw () {
		try {
			//Load FXML files
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/Tiles/Bank/confirmationBank.fxml"));
			AnchorPane depositPane = (AnchorPane) loader.load();
			
			Scene scene = new Scene (depositPane);
			bankDialogStage.setScene(scene);
			bankDialogStage.show();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void handleLeaveBank (ActionEvent e) {
		bankDialogStage.close();
	}
	
	public void setBankDialogStage (Stage stage){
		this.bankDialogStage = stage;
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}
	
	public void setMainStage (Stage stage){
		this.stage = stage;
	}
	
	

}
