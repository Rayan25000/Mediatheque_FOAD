package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		BookVisitor bookVisitor = new BookVisitor();
		for (Item item : items)
			item.accept(bookVisitor);
	}

	public void printOnlyCDs() {
		CDVisitor cdVisitor = new CDVisitor();
		for (Item item : items)
			item.accept(cdVisitor);
	}

}
