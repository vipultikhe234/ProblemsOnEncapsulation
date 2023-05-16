package problem7;

import java.util.Scanner;

public class MakeStudent {
	Scanner sc = new Scanner(System.in);
	Student st = new Student();

	public void takeInfo() {
		System.out.println("Enter Information of Student");
		System.out.println("Enter Student Name");
		String name = sc.next();
		System.out.println("Enter Student Roll Number");
		int rollNum = sc.nextInt();
		System.out.println("Enter Student Id Number");
		int stdId = sc.nextInt();
		st.setName(name);
		st.setRollNum(rollNum);
		st.setStdId(stdId);
	}

	public String showInfo() {
		return "College Name : " + st.getClgName() + "\nStudent name : " + st.getName() + "\nStudent Roll Number : "
				+ st.getRollNum() + "\nStudent Id : " + st.getStdId();
	}
}
