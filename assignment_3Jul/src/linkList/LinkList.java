package linkList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Write a Java program to append the specified element to the end of a linked list.
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Red");
		ll.add("Yellow");
		ll.add("White");
		ll.add("Pink");
		ll.add("Cyan");
		System.out.println("The linked list: " + ll);
		
//		2. Write a Java program to iterate through all elements in a linked list.
		for (String element : ll) {
		    System.out.println(element);
		}
		
//		3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
		 Iterator p = ll.listIterator(2);
		 while (p.hasNext()) {
			   System.out.println(p.next());
			   }
		
//		 4. Write a Java program to iterate a linked list in reverse order.
		 Iterator it = ll.descendingIterator();
		 System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
	     
//	     5. Write a Java program to insert the specified element at the specified position in the linked list.
	     ll.add(2,"Violet");
	     
//	     6. Write a Java program to insert elements into the linked list at the first and last positions.
	     ll.addFirst("Black");
	     ll.addLast("Green");
	     System.out.println("Final linked list:" + ll);
	     
//	     7. Write a Java program to insert the specified element at the front of a linked list.
	     ll.offerFirst("Indigo");
	     System.out.println("Final linked list:" + ll);
	     
//	     8. Write a Java program to insert the specified element at the end of a linked list
	     ll.offerLast("Blue");
	     System.out.println("Final linked list:" + ll);
	     
//	     9. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	     System.out.println("First Element is: "+ll.getFirst());
	     System.out.println("Last Element is: "+ll.getLast());
	     
	     
//	     10. Write a Java program to remove a specified element from a linked list.
	     ll.remove(2);
	     System.out.println("The New linked list: " + ll);
	    }
	     
	     
	}

