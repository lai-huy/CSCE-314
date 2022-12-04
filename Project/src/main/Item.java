package main;

public class Item {
    protected String name;
    protected float calories;
    protected String itemType;
    
    public Item() {
        this(new String(), 0f, new String());
    }
    
    public Item(final String name, final float cal, final String type) {
        this.name = name;
        this.calories = cal;
        this.itemType = type;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setCalories(final float cal) {
        this.calories = cal;
    }
    
    public String getName() {
        return this.name;
    }
    
    public float getCalories() {
        return this.calories;
    }
    
    public String getItemType() {
        return this.itemType;
    }
}
