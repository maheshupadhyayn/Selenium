package linkedListPkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteration {

	public static void main(String[] args) {
		linkedListByDescendingOperator();
	}
	/*
	 * Method to demonstrate, iteration of linkedlist using Iterator interface
	 */
	public static void linkedListByIterator(){
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1);
        //Traversing list through Iterator interface - which has hasNext(), next() & remove method
      	//Iterator can traverse only in forward direction, Helps to traverse Map, List and Set.
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}
	/*
	 * Method to demonstrate, iteration of linkedlist using ListIterator interface
	 */
	public static void linkedListByListIterator(){
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1);
        //Traversing list through ListIterator interface, Can only traverse List and not the Set & Map.
      	// ListIterator traverses both in forward and backward directions. Can help to add element/object in List
      	//ListIterator methods are next(), previous(), hasNext(), hasPrevious(), add(E e).
        ListIterator<Integer> itr = listOne.listIterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        itr = listOne.listIterator(listOne.size());
        while(itr.hasPrevious()){
        	System.out.println(itr.previous());
        }
	}
	/*
	 * Method to demonstrate, iteration of Linkedlist using for loop
	 */
	public static void linkedListByForLoop(){
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1);
		//Traversing list through for loop
		//size() - It is used to return the number of elements present in the list.
		for(int itr=0;itr<listOne.size();itr++){
			System.out.println(listOne.get(itr));  
		}
	}
	/*
	 * Method to demonstrate, iteration of linkedlist using for Each loop
	 */
	public static void linkedListByForEachLoop(){
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
		//Traversing list through for each loop
		for(int ele:listOne){
			System.out.println(ele);  
		}
	}
	/*
	 * Method to demonstrate, iteration of linkedlist using descending iterator
	 */
	public static void linkedListByDescendingOperator(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
    	//demonstrate descendingIterator - It is used to return an iterator over the elements in a deque in reverse sequential order.
		Iterator<Integer> itr = listOne.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				
	}
}
