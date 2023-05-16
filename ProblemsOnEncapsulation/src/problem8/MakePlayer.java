package problem8;

import java.util.Scanner;

public class MakePlayer {
	Scanner sc=new Scanner(System.in);
	Player p;

	public void takeInfo() {
		System.out.println("Enter Information of Player");
		System.out.println("Enter name of player");
		String name = sc.next();
		System.out.println("Enter age of player");
		int age = sc.nextInt();
		System.out.println("Enter type of game");
		String type = sc.next();
		p = new Player(name, age, type);

	}

	public String showInfo() {
		return "Name of Player : " + p.getpName() + "\nAge pf Player : " + p.getpAge() + "\nType of Game : "
				+ p.getGameType();
	}
}
