package basicPkg;

import java.util.HashSet;
import java.util.Iterator;

public class SetClass {
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Reshma");  
		set.add("Ameet");  
		set.add("Reshma");  
		set.add("Swapnil");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  //remove()
			System.out.println(itr.next());  
		}  
	}	
		
}
