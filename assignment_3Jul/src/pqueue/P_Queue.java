package pqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class P_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
		
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		  queue.add("Red");
		  queue.add("Green");
		  queue.add("Orange");
		  queue.add("White");
		  queue.add("Black");
		  System.out.println("Elements of the Priority Queue: ");
		  System.out.println(queue);
		
//		  Write a Java program to insert a given element into a priority queue.
		
		queue.offer("blue");
		
		System.out.println("The New Priority Queue: " + queue);
		
//		Write a Java program to retrieve and remove the first element
		 PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		 pq1.add(10);
		   pq1.add(22);
		   pq1.add(36);
		   pq1.add(25);
		   pq1.add(16);
		   pq1.add(70);
		   pq1.add(82);
		   pq1.add(89);
		   pq1.add(14);
		   System.out.println("Original Priority Queue: "+pq1);
		   System.out.println("Removes the first element: "+pq1.poll());
		   System.out.println("Priority Queue after removing first element: "+pq1);
		
//		   Write a Java program to convert a Priority Queue element to string representations.
		   String str1;
		   str1 = pq1.toString();
		   System.out.println("String representation of the Priority Queue: "+str1);    
		
//		   Write a Java program to convert a priority queue to an array containing all its elements.
		   
		   List<String> array_list = new ArrayList<String>(queue);
		   System.out.println("Array containing all of the elements in the queue: "+array_list);
		   
//		Write a Java program to change priorityQueue to maximum priority queue.
		   System.out.print("\nMaximum Priority Queue: ");
		   Integer val = null;
		   while( (val = pq1.poll()) != null) {
		       System.out.print(val+"  ");
		         }
		   	  System.out.print("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
