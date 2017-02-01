

package lesson16;

import java.util.Comparator;

public class CarComparator implements Comparator<Car>{
	
	public int compare(Car car1, Car car2) {
		if(car1.getMaxSpeed() > car2.getMaxSpeed()) {
			return 1;
		}
		if(car1.getMaxSpeed() < car2.getMaxSpeed()) {
			return -1;
		}
		return 0;
	}
	
}
