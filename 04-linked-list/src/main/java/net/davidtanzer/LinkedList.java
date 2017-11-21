package net.davidtanzer;

public class LinkedList {
	private int size;
	private ListItem head;

	public int size() {
		return size;
	}

	public void add(String content) {
		size++;
		if(head == null) {
			head = new ListItem(content);
		} else {
			end().append(new ListItem(content));
		}
	}
	
	public ListItem end() {
		if(head == null) {
			return null;
		}
		
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
