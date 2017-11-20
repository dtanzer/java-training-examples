package net.davidtanzer;

public class ListItem<T> {

	private T content;
	private ListItem<T> next;

	public ListItem(T content) {
		this.content = content;
	}

	public T content() {
		return content;
	}

	public ListItem<T> next() {
		return next;
	}

	void setNext(ListItem<T> next) {
		this.next = next;
	}

	public void insert(T content) {
		ListItem<T> oldNext = next;
		next = new ListItem<T>(content);
		next.setNext(oldNext);
	}

}
