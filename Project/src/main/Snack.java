package main;

public class Snack extends Item {
    private float weight;
    private boolean containsNuts;

    public Snack() {
        super();
        this.weight = 0f;
        this.containsNuts = false;
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
