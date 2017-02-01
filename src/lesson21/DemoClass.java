package lesson21;

public class DemoClass {
	public static void main(String[] args) {
		
		int i1 = 2;
		int i2 = new Integer(2);
		
		Integer o1 = new Integer(2);
		Integer o2 =2;
		Integer o3 = new Integer(2);
		
		
		System.out.println(i1==o1);
		System.out.println(i1==o2);
		System.out.println(i2==o1);
		System.out.println(i2==o2);		
		System.out.println(o2==o3);
		
		
	}
}
