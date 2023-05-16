package problem7;

public class Student {
	private static String clgName = "DMIETR";
	private String stdName;
	private int rollNum;
	private int stdId;

	public String getName() {
		return stdName;
	}

	public void setName(String name) {
		this.stdName = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getClgName() {
		return clgName;
	}
}
