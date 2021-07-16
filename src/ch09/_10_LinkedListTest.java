package ch09;

import java.util.LinkedList;

// p416
public class _10_LinkedListTest {
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		System.out.println(myList);	// A D B C
		
		myList.addFirst("0");
		System.out.println(myList);	// 0 A D B C
		
		System.out.println(myList.removeLast());	// C
		System.out.println(myList);	// 0 A D B C

	}
}
