package lesson18.more;

import lesson18.more.OuterClass1.NestedStaticClass;

public class OuterClass {
	private String value;
	private static int count;
	
	void useMemberFromInnerClass(){
		InnerClass inner = new InnerClass();
		System.out.println(inner.age);
	}
	
	public class InnerClass {
		//compilation error:
		//private static String name = "SoftAcad";
		private String age = "SoftAcad";
		
		public void printMemberFromOuterClass() {
			System.out.println(count);
			System.out.println(value);
		}
	}
}
