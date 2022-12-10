package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
 
public class Vending {
    protected ArrayList<String> directory;
    protected ArrayList<Queue<Item>> slots;

    public Vending(final ArrayList<String> contents) {
        this.slots = new ArrayList<>(contents.size());
        this.loadItem(contents);
    }

    public void loadItem(final ArrayList<String> contents) {
        for (int i = 0; i < contents.size(); ++i) {
            this.slots.add(new LinkedList<>());
            String[] data = contents.get(i).split(",\\s");
            Item item = "Drink".equals(data[0])
                    ? new Drink(data[1], Float.parseFloat(data[2]), data[0], Float.parseFloat(data[3]), data[4])
                    : new Snack(data[1], Float.parseFloat(data[2]), data[0], Float.parseFloat(data[3]),
                            Boolean.parseBoolean(data[4]));
            for (int j = 0; j < Integer.parseInt(data[5]); ++j)
                this.slots.get(i).add(item);
        }
    }

    public Item unloadItem(final int index) {
        Queue<Item> slot = this.slots.get(index);
        return slot.isEmpty() ? null : slot.poll();
    }

    public void unloadItems(final ArrayList<Integer> items) {
        for (int index : items)
            this.unloadItem(index);
    }

    public ArrayList<Integer> findProduct(final String product) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < this.slots.size(); ++i)
            if (this.slots.get(i).peek().getName() == product)
                index.add(i);
        return index;
    }

    public void displayItems() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (final Queue<Item> slot : this.slots) {
            str.append(slot.toString());
            str.append('\n');
        }
        
        return str.toString();
    }
}
