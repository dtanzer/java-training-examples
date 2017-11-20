package net.davidtanzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
	@Test
	public void sizeIsZeroAfterInit() {
		LinkedList<String> list = new LinkedList<>();
		
		assertEquals(0, list.size());
	}
	
	@Test
	public void sizeIsOneAfterAddingOneItem() {
		LinkedList<String> list = new LinkedList<>();
		list.add("one");
		
		assertEquals(1, list.size());
	}
	
	@Test
	public void returnsHeadAfterAddingOneItem() {
		LinkedList<String> list = new LinkedList<>();
		list.add("one");
		
		ListItem<String> item = list.head();
		
		assertNotNull(item);
		assertEquals("one", item.content());
	}
	
	@Test
	public void nextItemOfHeadContainsSecondContentAfterAddingTwoItems() {
		LinkedList<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		
		ListItem<String> head = list.head();
		
		assertNotNull(head.next());
		assertEquals("two", head.next().content());
	}
	
	@Test
	public void endReturnsLastListItem() {
		LinkedList<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		ListItem<String> end = list.end();
		
		assertNull(end.next());
		assertEquals("three", end.content());
	}
	
	@Test
	public void insertsIntoMiddleOfList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		
		ListItem<String> head = list.head();
		head.insert("one.a");
		
		assertNotNull(head.next());
		assertEquals("one.a", head.next().content());
		assertEquals("two", head.next().next().content());
	}
	
	@Test
	public void extendsSuperTes() {
		LinkedList<? extends Number> l1 = new LinkedList<Integer>();
		
		//l1.add(5);
		Number n1 = l1.head().content();

	
		LinkedList<? super Number> l2 = new LinkedList<Object>();
		
		l2.add(5);
		//Number n2 = l2.head().content();
}
}
