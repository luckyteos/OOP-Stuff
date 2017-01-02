package model;
import java.util.ArrayList;
import java.util.Scanner;

import application.MainApp;
import controller.ConfirmationBankController;

public class BankAccount {
	
	private int playerNo = Player.getPlayerNo();
	private ConfirmationBankController bankController = new ConfirmationBankController();

	public void deposit (ArrayList <Player> player) {
		
		/* Input validation - amt cannot be <=0 */
		double depositAmt = bankController.getAmount();
		
		//for (int i = 0; i < player.size(); i++) {
			//if (i == playerNo) {//
				Player tempPlayer = player.get(1);
				double currentBalance = tempPlayer.getCashinBank();
				double newBalance = currentBalance + depositAmt;
				tempPlayer.setCashinBank(newBalance);
				System.out.println(tempPlayer.getCashinBank());
			//}
		//}
		
		
		
	}
	
	public void withdraw (ArrayList<Player> player){
		
		/* Get Input from text Field (temp testing) */
		/* Input validation - amt cannot be <=0 or more than account bal*/
		
		double withdrawal = bankController.getAmount();
		
		for (int i = 0; i < player.size(); i++) {
			//if (i == playerNo) {
				Player tempPlayer = player.get(1);
				double currentBalance = tempPlayer.getCashinBank();
				double newBalance = currentBalance - withdrawal;
				tempPlayer.setCashinBank(newBalance);
				System.out.print(tempPlayer.getCashinBank());
				
			//}
		}
		
		
	}
	
	public static void main (String [] args) {
		
		MainApp mainApp = new MainApp();
		
		Player player1 = mainApp.getPlayers().get(2);
		
		System.out.print(player1.getCashonHand());
	}
	
	

}
