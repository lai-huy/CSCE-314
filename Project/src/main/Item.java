package main;

public class Item {
    protected String name;
    protected float calories;
    protected String itemType;
    
    public Item() {
        this.name = new String();
        this.calories = 0f;
        this.itemType = new String();
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
