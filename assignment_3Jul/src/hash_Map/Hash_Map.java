package hash_Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Java program to associate the specified value with the specified key in a HashMap.
		
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }  
		
//		Write a Java program to count the number of key-value (size) mappings in a map.
		  System.out.println("Size of the hash map: "+hash_map.size());
		
//		Write a Java program to check whether a map contains key-value mappings (empty) or not.
		  System.out.println("Is hash map empty: " + hash_map.isEmpty());
		
//		Write a Java program to get a shallow copy of a HashMap instance.
		
		  HashMap<Integer,String> new_map= new HashMap<Integer,String>(); 
		   new_map = (HashMap)hash_map.clone();     
		   System.out.println("Cloned map: " + new_map);
		
//		Write a Java program to get a collection view of the values contained in this map.
		   System.out.println("Collection view is: "+ hash_map.values());
		
		
		
		
		
	}

}
