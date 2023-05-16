package problem2;

public class Student {
	String name;
	int rollNum;
	double marks;
	static String clgName = "JBK";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public static String getClgName() {
		return clgName;
	}

}
