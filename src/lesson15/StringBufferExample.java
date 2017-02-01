package lesson15;

public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demoStrings();
		demoBuffer();
		
		StringBuffer builder  =new StringBuffer();
		String test = "test";
		for(int i=0;i<100;i++){
			builder.append(test);
			System.out.println(builder.toString().length()+":"+builder.capacity());
		}
//		System.out.println(builder.toString());
		
	}

	private static void demoStrings(){
		String test = "test;";
		String str="";
		for(int i=0;i<1000000;i++){
			str+=test;
		}
	}
	
	private static void demoBuffer(){

	}
	
	
}
