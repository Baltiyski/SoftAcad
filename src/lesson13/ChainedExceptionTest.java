package lesson13;

public class ChainedExceptionTest {
	public static void main(String[] args) throws Exception {
		String s = null;
		testMethod(s);
	}
	
	public static void testMethod(String s) throws Exception{
		try{
			System.out.println("String's lenght is: " + s.length());
		}catch(NullPointerException e){
			Exception newException = new Exception("error while trying to print string's lenght", e);
			throw newException;
		}
	}

}
