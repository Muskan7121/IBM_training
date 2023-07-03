package hashset;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		1. 1. Write a Java program to append the specified element to the end of a hash set.
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        System.out.println("The Hash Set: " + h_set);
        
//        2. Write a Java program to get the number of elements in a hash set
        System.out.println("Size of the Hash Set: " + h_set.size());
        
//        3.Write a Java program to empty an hash set.
        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements "+h_set);   
        
//        4.Write a Java program to test if a hash set is empty or not.
        System.out.println("Checking the list is empty or not! "+h_set.isEmpty());
        
//        5. Write a Java program to clone a hash set to another hash set.
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        
        HashSet <String> new_hSet = new HashSet <String> ();
        new_hSet = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_hSet);
        
//        6. Write a Java program to convert a hash set to an array.\
        String[] new_array = new String[new_hSet.size()];
        new_hSet.toArray(new_array);
        System.out.println("Array elements: ");
        for(String element : new_array){
          System.out.println(element);
       }
        
        
//        7. Write a Java program to compare two sets and retain elements that are the same.
        h_set.retainAll(new_hSet);
        System.out.println("HashSet content:");
        System.out.println(h_set);

//        /8 . Write a Java program to remove all elements from a hash set.
        h_set.clear();
        System.out.println(h_set);
        
        
	}

}
