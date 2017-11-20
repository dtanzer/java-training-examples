package net.davidtanzer;

public class LinkedList {
	private int size;
	private ListItem head;

	public int size() {
		return size;
	}

	public void add(String item) {
		size++;
		if(head == null) {
			head = new ListItem(item);
		} else {
			end().setNext(new ListItem(item));
		}
	}
	
	public ListItem end() {
		ListItem current = head;
		while(current.next() != null) {
			current = current.next();
		}
		return current;
	}

	public ListItem head() {
		return head;
	}

}
