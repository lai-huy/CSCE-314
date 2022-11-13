package main;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Vehicle> {
	public VehicleComparator() {
	}

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		return Float.compare(o1.getWeight(), o2.getWeight());
	}

}
