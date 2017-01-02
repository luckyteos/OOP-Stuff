package model;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	
	private int playerNo = Player.getPlayerNo();

	public void deposit (ArrayList <Player> player) {
		
		/* Get Input from text Field (temp testing) */
		/* Input validation - amt cannot be <=0 */
		double depositAmt = 100;
		
		for (int i = 0; i < player.size(); i++) {
			if (i == playerNo) {
				Player tempPlayer = player.get(i);
				double currentBalance = tempPlayer.getCashinBank();
				double newBalance = currentBalance + depositAmt;
				tempPlayer.setCashinBank(newBalance);
			}
		}
		
		
		
	}
	
	public void withdraw (ArrayList<Player> player){
		
		/* Get Input from text Field (temp testing) */
		/* Input validation - amt cannot be <=0 or more than account bal*/
		
		double withdrawal = 50;
		
		for (int i = 0; i < player.size(); i++) {
			if (i == playerNo) {
				Player tempPlayer = player.get(i);
				double currentBalance = tempPlayer.getCashinBank();
				double newBalance = currentBalance - withdrawal;
				tempPlayer.setCashinBank(newBalance);
			}
		}
		
		
	}
	
	public static void main (String [] args) {
		
		Player playerName = new Player("Amy");
		Player player2 = new Player("John");
		Player player3 = new Player("Mary");
		ArrayList<Player> customers = new ArrayList<Player>();
		customers.add(playerName);
		customers.add(player2);
		customers.add(player3);
		
		BankAccount account = new BankAccount();
		
		account.deposit(customers);
		account.deposit(customers);
		
		for (Player p: customers){
			System.out.println("Balance in bank is: " + p.getCashinBank());
		}
	
	}
	
	

}
