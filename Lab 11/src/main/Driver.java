package main;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		Animal dog = new Animal(0, "Cat", 3.5f, new Address("AL", "Cheese", 234578, "Montgomery"));
		Animal cat = new Animal(1, "Fish", .03f, new Address("RI", "Cheese", 45678, "Providence"));
		Animal fish = new Animal(2, "Squirel", 4.7f, new Address("MS", "Cheese", 126343, "Jackson"));
		Animal squirel = new Animal(3, "Dog", 100f, new Address("LA", "Cheese", 123873, "New Orleans"));
		Vehicle car = new Vehicle(0, "800-002", 35, 2000f, new Address("CA", "Cheese", 12323, "Sacremento"));
		Vehicle truck = new Vehicle(1, "800-002", 35, 7000f, new Address("NV", "Cheese", 127543, "Reno"));
		Vehicle motorcycle = new Vehicle(2, "800-002", 35, 1000f, new Address("HI", "Cheese", 126379, "Honolulu"));
		Vehicle boat = new Vehicle(3, "800-002", 35, 1000000f, new Address("TX", "Cheese", 78750, "College Station"));

		ArrayList<Animal> zoo = new ArrayList<>();
		zoo.add(cat);
		zoo.add(squirel);
		zoo.add(fish);
		zoo.add(dog);

		ArrayList<Vehicle> dealership = new ArrayList<>();
		dealership.add(boat);
		dealership.add(motorcycle);
		dealership.add(car);
		dealership.add(truck);

		ArrayList<Object> stuff = new ArrayList<>();
		stuff.addAll(zoo);
		stuff.addAll(dealership);
		System.out.println("Before sort.");
		for (final Object o : stuff)
			System.out.println(o.toString());
		System.out.println("After sort.");
		stuff.sort(new AddressComparator());
		for (final Object o : stuff)
			System.out.println(o.toString());
	}
}
