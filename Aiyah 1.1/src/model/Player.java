package model;

public class Player {
	
	private String name;
	private String Id;
	private double cashonHand;
	private double cashinBank;
	private double groceries;
	private double health;
	private boolean inHospital;
	private static int playerNo = -1;
	
	
	public Player (String name) {
		this.name = name;
		cashonHand = 1500;
		cashinBank = 0;
		setInHospital(false);
		setPlayerNo(getPlayerNo() + 1);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getCashonHand() {
		return cashonHand;
	}

	public void setCashonHand(double cashonHand) {
		this.cashonHand = cashonHand;
	}

	public double getCashinBank() {
		return cashinBank;
	}

	public void setCashinBank(double cashinBank) {
		this.cashinBank = cashinBank;
	}

	public boolean isInHospital() {
		return inHospital;
	}

	public void setInHospital(boolean inHospital) {
		this.inHospital = inHospital;
	}

	public static int getPlayerNo() {
		return playerNo;
	}

	public static void setPlayerNo(int playerNo) {
		Player.playerNo = playerNo;
	}
	
	

}
