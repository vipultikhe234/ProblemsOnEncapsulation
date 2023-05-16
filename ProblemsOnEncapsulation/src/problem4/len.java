package problem4;

public class len {

	public static void main(String[] args) {
		String name="viul1234";
		
		int len=name.length();
		for(int i=len-1;i>=0;i--){
			int x=name.charAt(i);
			System.out.println(name.charAt(i));
			System.out.println(name.charAt(i)+1);
			System.out.println(x);
			break;
		}

	}

}
