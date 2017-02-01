package lesson18.more;

import lesson18.more.OuterClass.InnerClass;

public class OuterTest {
	public static void main(String[] args) {
		//compilation error:
		//OuterClass.InnerClass nsc = new OuterClass.InnerClass();
		
		OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		
		inner.printMemberFromOuterClass();
	}
}
