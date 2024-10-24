package basicPkg;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class BeforeCollection {

	public static void main(String[] args) {
		// Creating instances of array, vector and hashtable 
        int arr[] = new int[] {1, 2, 3, 4};
        Vector<Integer> vectorInstance = new Vector(); 
        Hashtable<Integer, String> hashInstance = new Hashtable(); 
        vectorInstance.addElement(1); 
        vectorInstance.addElement(2); 
        hashInstance.put(1,"selenium"); 
        hashInstance.put(2,"java"); 
  
        // Array instance creation requires [], while Vector 
        // and hastable require () 
        // Vector element insertion requires addElement(), but 
        // hashtable element insertion requires put() 
  
        // Accessing first element of array, vector and hashtable 
        System.out.println(arr[0]); 
        System.out.println(vectorInstance.elementAt(0)); 
        System.out.println(hashInstance.get(1)); 
  
        // Array elements are accessed using [], vector elements 
        // using elementAt() and hashtable elements using get() 

	}
}
