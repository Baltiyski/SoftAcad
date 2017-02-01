package lesson16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
		Car bmw = new Car("BMW", 200);
		Car opel = new Car("Opel", 150);
		Car nisan = new Car("Nisan", 180);
		Car trabant = new Car("Trabant", 100);
		
		Map<String, Car> map = new HashMap<String, Car>();
		
		map.put("BMW", bmw );
		map.put("OPEL", opel);
		map.put("NISAN", nisan);
		map.put("TRABANT", trabant);
		
		System.out.println(map.size());
		
		Set<String> ser = map.keySet();
		Iterator<String> it = ser.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Car car = (Car) map.get(key);
			System.out.println(car);
		}
		
		System.out.println(map.get("BMW"));
		
		Map<String, Car> map1 = new TreeMap<String, Car>();
		
		map.put("BMW2", bmw);
		map.put("OPEL2", opel);
		map.put("NISAN2", nisan);
		map.put("TRABANT2", trabant);
		
		System.out.println(map1.size());
	}

}
