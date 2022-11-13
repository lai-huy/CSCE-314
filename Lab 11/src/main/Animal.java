package main;

public class Animal {
	private int type;
	private String foodRequired;
	private float weight;
	private Address address;

	public Animal(final int type, final String food, final float weight, final Address address) {
		this.type = type;
		this.foodRequired = food;
		this.weight = weight;
		this.address = address;
	}

	public int getType() {
		return type;
	}

	public String getFoodRequired() {
		return foodRequired;
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

	public void setFoodRequired(String foodRequired) {
		this.foodRequired = foodRequired;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", foodRequired=" + foodRequired + ", weight=" + weight + ", address=" + address
				+ "]";
	}
}
