package main;

public class Vehicle {
	private int type;
	private String licencePlate;
	private int age;
	private float weight;
	private Address address;

	public Vehicle(int type, String plate, int age, float weight, Address address) {
		this.type = type;
		this.licencePlate = plate;
		this.age = age;
		this.weight = weight;
		this.address = address;
	}

	public int getType() {
		return type;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public Address getAddress() {
		return address;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", licencePlate=" + licencePlate + ", age=" + age + ", weight=" + weight
				+ ", address=" + address + "]";
	}

}
