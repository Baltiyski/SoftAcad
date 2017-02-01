package lesson15;

public class IntTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "test";
		for(int i=0;i<1000000;i++){
			test+="test";
		}
		System.out.println(test);
		
	}

}
