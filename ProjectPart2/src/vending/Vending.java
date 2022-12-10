package vending;

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

	public void unloadItem(final int index) {
		if (index >= this.slots.size())
			return;
		final Queue<Item> s = this.slots.get(index);
		if (s.isEmpty())
			return;
		int max = 0, j = 0;
		for (final Integer i : this.findProduct(s.peek().getName())) {
			final Queue<Item> slot = this.slots.get(i.intValue());
			if (slot.size() > max) {
				max = slot.size();
				j = i.intValue();
			}
		}
		
		this.slots.get(j).poll();
	}

	public void unloadItems(final ArrayList<Integer> items) {
		for (final Integer index : items)
			this.unloadItem(index.intValue());
	}

	public ArrayList<Integer> findProduct(final String product) {
		ArrayList<Integer> index = new ArrayList<>();
		for (int i = 0; i < this.slots.size(); ++i)
			if (this.slots.get(i).peek().getName().equals(product))
				index.add(Integer.valueOf(i));
		return index;
	}

	public void displayItems() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (final Queue<Item> slot : this.slots) {
			if (slot.isEmpty()) {
				str.append("<empty>\n");
			} else {
				final Item item = slot.peek();
				final String itemType = item.getItemType();
				String type;
				if (item instanceof Drink)
					type = ((Drink) item).getType();
				else
					type = itemType;
				str.append(String.format("%s: (%s): %d%n", item.getName(), type, slot.size()));
			}
		}

		return str.toString();
	}
}
