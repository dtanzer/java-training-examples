package net.davidtanzer;

public class LinkedList<T> {
	private int size;
	private ListItem<T> head;

	public int size() {
		return size;
	}

	public void add(T item) {
		size++;
		if(head == null) {
			head = new ListItem<T>(item);
		} else {
			end().setNext(new ListItem<T>(item));
		}
	}
	
	public ListItem<T> end() {
		ListItem<T> current = head;
		while(current.next() != null) {
			current = current.next();
		}
		return current;
	}

	public ListItem<T> head() {
		return head;
	}

}
