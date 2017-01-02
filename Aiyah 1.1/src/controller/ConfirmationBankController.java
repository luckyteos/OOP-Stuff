package controller;

import java.util.ArrayList;
import java.util.Collections;

import application.MainApp;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import model.BankAccount;
import model.Player;

public class ConfirmationBankController {
	
	@FXML
	private TextField amtField;
	@FXML
	private Button Proceedbtn;
	
	private double amount;
	
	private boolean depositCheck = BankInitialInterfaceController.isDeposit();
	
	private MainApp mainApp;
	
	
	
	public void checkMode(){
			
			BankAccount account = new BankAccount();
			
			setAmount(Double.parseDouble(amtField.getText()));
			account.deposit(mainApp.getPlayers());
			
			
		
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}
	
	

}
