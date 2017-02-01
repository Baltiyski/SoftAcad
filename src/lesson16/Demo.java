package lesson16;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList();
		System.out.println(list.size());
		
		Car bmw = new Car("BMW", 120);
		Car opel = new Car("Opel", 110);
		list.add(bmw);
		list.add(0,opel);
		System.out.println(list.size());
		list.add(bmw);
		System.out.println(list.size());
		System.out.println(list.size());
		
//		Car newBmw = list.get(0);
//		Car newOpel = (Car) list.get(1);
//		
//		System.out.println(newBmw);
//		System.out.println(newOpel);
//		
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Car car =(Car) it.next();
//			System.out.println(car.toString());
//		}
//		
		
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			
//		}
	}
}
