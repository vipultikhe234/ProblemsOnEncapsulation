package problem1;

public class Main {
	public static void main(String[] args) {
		MakeStudent ms = new MakeStudent();
		Student xy = ms.make();
		System.out.println(xy.getName());
		System.out.println(xy.getMarks());
		System.out.println(xy.getRollNum());
		System.out.println();
		
		xy.setName("xyz");
		xy.setMarks(45);
		xy.setRollNum(34);
		
		System.out.println(xy.getName());
		System.out.println(xy.getMarks());
		System.out.println(xy.getRollNum());
	}
}