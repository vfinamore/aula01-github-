package application;

public class Boxing {

	public static void main(String[] args) {
		
		int x = 20; //boxing
		
		Object obj = x;
		
		System.out.println(obj);

		
		int y = (int) obj; //unboxxing
		
		System.out.println(y);
		
		
		

	}

}
