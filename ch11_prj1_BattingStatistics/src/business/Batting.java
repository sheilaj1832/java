package business;

public class Batting {

	private int atBats;
	private int atBatsResult;

	public Batting(int atBats, int atBatsResult) {
		super();
		this.atBats = atBats;
		this.atBatsResult = atBatsResult;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public int getAtBatsResult() {
		return atBatsResult;
	}

	public void setAtBatsResult(int atBatsResult) {
		this.atBatsResult = atBatsResult;
	}

	@Override
	public String toString() {
		return "Batting" + atBats + ", atBatsResult=" + atBatsResult + "]";
	}

}