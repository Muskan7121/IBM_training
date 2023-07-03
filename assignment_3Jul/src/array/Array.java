package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.  Write a Java program to create an array list, add some colors (strings) and print out the collection.
		List <String> arr= new ArrayList<String>();
		arr.add("Red");
		arr.add("Blue");
		arr.add("Violet");
		arr.add("Cyan");
		arr.add("Green");
		arr.add("Black");
		System.out.println(arr);
		
		
		//2. Write a Java program to iterate through all elements in an array list.
		for(String element : arr) {
			System.out.println(element);
		}
		
		//3. Write a Java program to insert an element into the array list at the first position.
		
		arr.add(3,"White");
		arr.add(5,"Pink");
		System.out.println(arr);
		
		//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(arr.get(5));
		
		//5 Write a Java program to update an array element by the given element.
		arr.set(0, "YEllow");
		System.out.println(arr);
		
		//6. Write a Java program to remove the third element from an array list.
		arr.remove(2);
		System.out.println(arr);
		
		//7. Write a Java program to search for an element in an array list.
		if(arr.contains("Pink")) {
			System.out.println("Found the element");
		}else {
			System.out.println("There is no such element");
		}
		
		//8. Write a Java program to sort a given array list.
		Collections.sort(arr);
		System.out.println(arr);
		
		//9. Write a Java program to copy one array list into another.
		List<String> List = new ArrayList<String>();
		Collections.copy(List, arr);
		System.out.println(List);
		
//		10. Write a Java program to shuffle elements in an array list.
		Collections.shuffle(arr);
		System.out.println(arr);
		
	}

}
