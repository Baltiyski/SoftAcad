package lesson02;

public class BreakExample {
	public static void main(String[] args) {
		for (int i = 0; i < 2000000000; i++) {
			if(i > 10) {
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("End");
	}
}
