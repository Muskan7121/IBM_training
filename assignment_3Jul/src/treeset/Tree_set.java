package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
		
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("Red");
		  tree_set.add("Green");
		  tree_set.add("Orange");
		  tree_set.add("White");
		  System.out.println("Tree set: "+ tree_set);
		  
//		  2. Write a Java program to get the first and last elements in a tree set
		  
		  System.out.println("First Element is: "+tree_set.first());
		  
		  System.out.println("Last Element is: "+tree_set.last());
		  
//		  3. Write a Java program to create a reverse order view of the elements contained in a given tree set.
		  Iterator it = tree_set.descendingIterator();
		  System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }
		     
//		     4.Write a Java program to get the number of elements in a tree set.
		     System.out.println("Size of the tree set: " + tree_set.size());
		     
//		     5. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
		     TreeSet <Integer>tree_num = new TreeSet<Integer>();

		     tree_num.add(10);
		     tree_num.add(22);
		     tree_num.add(36);
		     tree_num.add(25);
		     tree_num.add(16);
		     tree_num.add(70);
		     tree_num.add(82);
		     tree_num.add(89);
		     tree_num.add(14);
		     
		     System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
		     
		     
//		     Write a Java program to get the element in a tree set less than or equal to the given element.
		     
		     System.out.println("Less than or equal to 86 : "+tree_num.floor(86));
		     
//		     Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
		     
		     System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
		     
//		     Write a Java program to get an element in a tree set that has a lower value than the given element.
		     
		     System.out.println("Strictly less than 69 : "+tree_num.lower(69));
		     
		     
		     
//		     write a Java program to retrieve and remove the first element of a tree set.
		     
		     System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
		     System.out.println("Tree set after removing first element: "+tree_num);
		     
		     
		     
		     
//		     Write a Java program to retrieve and remove the last element of a tree set.
		     
		     System.out.println("Removes the last element: "+tree_num.pollLast());
		     System.out.println("Tree set after removing last element: "+tree_num);
		     
		     
//		     Write a Java program to remove a given element from a tree set.
		     
		     System.out.println("Removes 70 from the list: "+tree_num.remove(70));
		     System.out.println("Tree set after removing last element: "+tree_num);
		     
		     
		     
		  
	}

}
