package vending;

public class Snack extends Item {
    private float weight;
    private boolean containsNuts;

    public Snack() {
        this(new String(), 0f, new String(), 0f, false);
    }

    public Snack(final String name, final float cal, final String itemType, final float weight, final boolean nuts) {
        super(name, cal, itemType);
        this.weight = weight;
        this.containsNuts = nuts;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean containsNuts() {
        return this.containsNuts;
    }

    @Override
    public String toString() {
        return "Snack [weight=" + weight + ", containsNuts=" + containsNuts + ", name=" + name + ", calories="
                + calories + ", itemType=" + itemType + "]";
    }
}
