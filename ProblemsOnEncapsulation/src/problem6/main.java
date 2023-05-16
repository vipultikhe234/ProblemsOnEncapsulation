package problem6;

public class main {
	public static void main(String[] args) {
		Rectangle rt = new Rectangle(20, 30);
		System.out.println("Length : " + rt.getLength());
		System.out.println("Breath : " + rt.getBreath());
		System.out.println("Area of rectangle : " + (rt.getBreath() * rt.getLength()));

		System.out.println();
		rt.setLength(50);
		rt.setBreath(60);
		System.out.println("Length : " + rt.getLength());
		System.out.println("Breath : " + rt.getBreath());
		System.out.println("Area of rectangle : " + (rt.getBreath() * rt.getLength()));
	}
}
