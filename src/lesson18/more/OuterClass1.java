package lesson18.more;

public class OuterClass1 {
	private String value;
	private static int count;
	
	void accessMemberFromTheNestedClass(){
		System.out.println(NestedStaticClass.name);
		//compilation error:
		//System.out.println(NestedStaticClass.age);
	}
	
	public static class NestedStaticClass {
		private static String name = "SoftAcad";
		private String age = "SoftAcad";
		
		public void printMemberFromOuterClass() {
			System.out.println(count);
			//compilation error:
			//System.out.println(value);
		}
	}
}
