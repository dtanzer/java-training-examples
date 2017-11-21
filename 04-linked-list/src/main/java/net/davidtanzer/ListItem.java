package net.davidtanzer;

public class ListItem {

	private String content;
	private ListItem next;

	public ListItem(String content) {
		this.content = content;
	}

	public String content() {
		return content;
	}

	public ListItem next() {
		return next;
	}

	void append(ListItem next) {
		this.next = next;
	}

	public void insert(String content) {
		ListItem oldNext = next;
		next = new ListItem(content);
		next.append(oldNext);
	}

}
