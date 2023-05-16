package problem8;

public class Player {
	private String pName;
	private int pAge;
	private String gameType;

	public Player(String pName, int pAge, String gameType) {
		this.pName = pName;
		this.pAge = pAge;
		this.gameType = gameType;
	}

	public String getpName() {
		return pName;
	}

	public int getpAge() {
		return pAge;
	}

	public String getGameType() {
		return gameType;
	}
	
}
