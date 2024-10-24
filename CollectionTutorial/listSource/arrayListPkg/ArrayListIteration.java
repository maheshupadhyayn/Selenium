package arrayListPkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
*/
public class ArrayListIteration {
	/*
	 * This class has an implementation of Arraylist & Ways to iterate the elements of the collection in java
	 */
			
	public static void main(String args[]){  
		callArrayListByForEachRemainingMethod();
	}
	/*
	 * Method to demonstrate, iteration of arraylist using Iterator interface
	 */
	public static void callArrayListByIterator(){
		//Generic collection, where we need to mentioned type of collection in <>, this comes after jdk 1.5
		//ArrayList extends AbstractList implements List
		ArrayList<String> subjectList = new ArrayList<String>();//Creating empty arraylist  (constructor ArrayList())
		subjectList.add("maths");//Adding object/element in arraylist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//Traversing list through Iterator interface - which has hasNext(), next() & remove method
		//Iterator can traverse only in forward direction, Helps to traverse Map, List and Set.
		//Can not help to add element/object in List
		//Iterator itrInstance = subjectList.iterator();  - also works without type, only suppress warning will get
		Iterator<String> itrInstance = subjectList.iterator();  
		while(itrInstance.hasNext()){  
			System.out.println(itrInstance.next());  
		}
	}
	/*
	 * Method to demonstrate, iteration of arraylist using for loop
	 */
	public static void callArrayListByForLoop(){
		ArrayList<String> subjectList = new ArrayList<String>();//Creating empty arraylist  (constructor ArrayList())
		subjectList.add("maths");//Adding object/element in arraylist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//Traversing list through for loop
		//size() - It is used to return the number of elements present in the list.
		for(int itr=0;itr<subjectList.size();itr++){
			System.out.println(subjectList.get(itr));  
		}
	}
	/*
	 * Method to demonstrate, iteration of arraylist using for Each loop
	 */
	public static void callArrayListByForEachLoop(){
		ArrayList<String> subjectList = new ArrayList<String>();//Creating empty arraylist  (constructor ArrayList())
		subjectList.add("maths");//Adding object/element in arraylist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//Traversing list through for each loop
		for(String ele:subjectList){
			System.out.println(ele);  
		}
	}
	/*
	 * Method to demonstrate, iteration of arraylist using ListIterator interface
	 */
	public static void callArrayListByListIterator(){
		ArrayList<String> subjectList = new ArrayList<String>();//Creating empty arraylist  (constructor ArrayList())
		subjectList.add("maths");//Adding object/element in arraylist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//Traversing list through ListIterator interface, Can only traverse List and not the Set & Map.
		// ListIterator traverses both in forward and backward directions. Can help to add element/object in List
		//ListIterator methods are next(), previous(), hasNext(), hasPrevious(), add(E e).
		ListIterator<String> itrNext = subjectList.listIterator();
		while(itrNext.hasNext()){
			System.out.println(itrNext.next());
		}
		//Traversing list through ListIterator interface - using previous method
		ListIterator<String> itrPrevious = subjectList.listIterator(subjectList.size());
		while(itrPrevious.hasPrevious()){
			System.out.println(itrPrevious.previous());
		}
	}
	/*
	 * Method to demonstrate, iteration of arraylist using forEach() method
	 */
	public static void callArrayListByForEachMethod(){
		ArrayList<String> subjectList = new ArrayList<String>();//Creating empty arraylist  (constructor ArrayList())
		subjectList.add("maths");//Adding object/element in arraylist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//Traversing list through forEach() method using lambda
		//Lambda expressions basically express instances of functional interfaces(An interface with single abstract method is called functional interface.) 
		//lambda expressions implement the only abstract function and therefore implement functional interfaces
		subjectList.forEach(a->System.out.println(a));
		
		//Using lambda expression to print even/odd elements of arraylist 
		subjectList.forEach(n -> { if (subjectList.indexOf(n)%2 == 0) System.out.println(n); }); 
	}
	/*
	 * Method to demonstrate, iteration of arraylist using forEachRemaining() method
	 */
	public static void callArrayListByForEachRemainingMethod(){
		ArrayList<String> subjectList = new ArrayList<String>();//Creating empty arraylist  (constructor ArrayList())
		subjectList.add("maths");//Adding object/element in arraylist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//Traversing list through forEachRemaining() method using lambda
		Iterator<String> itrInstance = subjectList.iterator();
		itrInstance.forEachRemaining(a->System.out.println(a));
	}
}

