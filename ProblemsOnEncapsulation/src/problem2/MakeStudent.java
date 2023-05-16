package problem2;

import java.util.Scanner;

public class MakeStudent {
	Scanner sc;
	Student s;

	public void createInfo() {
		sc = new Scanner(System.in);
		s = new Student();

	}

	public void setInfo() {
		System.out.println("Enter information of student");
		System.out.println("Enter name of student");
		String name = sc.next();
		System.out.println("Enter roll number of student");
		int rollNum = sc.nextInt();
		System.out.println("Enter marks of student");
		double marks = sc.nextDouble();
		s.setName(name);
		s.setRollNum(rollNum);
		s.setMarks(marks);
	}

	public String showInfo() {
		return "Name : " + s.getName() + "\nRoll Number : " + s.getRollNum() + "\nMarks : " + s.getMarks()
				+ "\nInstitute Name : " + Student.getClgName();
	}
}
