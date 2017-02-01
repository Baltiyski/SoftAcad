package lesson21.demo;

import java.util.LinkedList;
import java.util.List;


public class Problem1 {

	private static List list = new LinkedList();
	
	public static void main(String[] args) {
		//User 1
		Integer integer = new Integer(3);
		String str = "test";
		Object obj = new Object();
		list.add(integer);
		list.add(str);
		list.add(obj);
		
		Integer obj1 =(Integer) list.get(0);
		String str1 = (String) list.get(1);
		
		//User2
		String[] array = new String[10];
		list.add(array);
		
		//User3 
		
		
	}

}
