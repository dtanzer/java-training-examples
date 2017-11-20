package net.davidtanzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
	@Test
	public void sizeIsZeroAfterInit() {
		LinkedList list = new LinkedList();
		
		assertEquals(0, list.size());
	}
	
	@Test
	public void sizeIsOneAfterAddingOneItem() {
		LinkedList list = new LinkedList();
		list.add("one");
		
		assertEquals(1, list.size());
	}
	
	@Test
	public void returnsHeadAfterAddingOneItem() {
		LinkedList list = new LinkedList();
		list.add("one");
		
		ListItem item = list.head();
		
		assertNotNull(item);
		assertEquals("one", item.content());
	}
	
	@Test
	public void nextItemOfHeadContainsSecondContentAfterAddingTwoItems() {
		LinkedList list = new LinkedList();
		list.add("one");
		list.add("two");
		
		ListItem head = list.head();
		
		assertNotNull(head.next());
		assertEquals("two", head.next().content());
	}
	
	@Test
	public void endReturnsLastListItem() {
		LinkedList list = new LinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		ListItem end = list.end();
		
		assertNull(end.next());
		assertEquals("three", end.content());
	}
	
	@Test
	public void insertsIntoMiddleOfList() {
		LinkedList list = new LinkedList();
		list.add("one");
		list.add("two");
		
		ListItem head = list.head();
		head.insert("one.a");
		
		assertNotNull(head.next());
		assertEquals("one.a", head.next().content());
		assertEquals("two", head.next().next().content());
	}
}
