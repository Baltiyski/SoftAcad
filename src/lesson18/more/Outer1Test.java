package lesson18.more;


public class Outer1Test {
	public static void main(String[] args) {
		OuterClass1.NestedStaticClass nsc = new OuterClass1.NestedStaticClass();
		
		nsc.printMemberFromOuterClass();
	}
}
