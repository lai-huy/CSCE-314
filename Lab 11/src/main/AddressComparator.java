package main;

import java.util.Comparator;

public class AddressComparator implements Comparator<Object> {
	public AddressComparator() {
	}

	@Override
	public int compare(Object o1, Object o2) {
		Animal a1 = null, a2 = null;
		Vehicle v1 = null, v2 = null;
		if (o1 instanceof Animal)
			a1 = (Animal) o1;
		else if (o1 instanceof Vehicle)
			v1 = (Vehicle) o1;

		if (o2 instanceof Animal)
			a2 = (Animal) o2;
		else if (o1 instanceof Vehicle)
			v2 = (Vehicle) o2;

		if (a1 != null) {
			if (a2 != null)
				return a1.getAddress().getState().compareTo(a2.getAddress().getState());
			else if (v2 != null)
				return a1.getAddress().getState().compareTo(v2.getAddress().getState());
		} else if (v1 != null)
			if (a2 != null)
				return v1.getAddress().getState().compareTo(a2.getAddress().getState());
			else if (v2 != null)
				return v1.getAddress().getState().compareTo(v2.getAddress().getState());
		return 0;

	}
}
