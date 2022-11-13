package main;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
	
	public AnimalComparator() {}
	
	@Override
	public int compare(Animal o1, Animal o2) {
		return Float.compare(o1.getWeight(), o2.getWeight());
	}
}
