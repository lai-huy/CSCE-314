package vending;

public class Drink extends Item {
    private float ounces;
    private String type;

    public Drink() {
        this(new String(), 0f, new String(), 0f, new String());
    }

    public Drink(final String name, final float cal, final String itemType, final float ounces, final String type) {
        super(name, cal, itemType);
        this.ounces = ounces;
        this.type = type;
    }
    
    public float getOunces() {
        return ounces;
    }
    
    public String getType() {
        return type;
    }
    
    public void setOunces(float ounces) {
        this.ounces = ounces;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Drink [ounces=" + ounces + ", type=" + type + ", name=" + name + ", calories=" + calories
                + ", itemType=" + itemType + "]";
    }
}
