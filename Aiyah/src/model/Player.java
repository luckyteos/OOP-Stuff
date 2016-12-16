package model;

public class Player {
	
	private String name;
	private String Id;
	private double cashonHand;
	private double cashinBank;
	private static int playerNo = 1;
	
	public Player (String name) {
		this.name = name;
		cashonHand = 1500;
		cashinBank = 0;
		playerNo++;
	}

}
