package linkedListPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		linkedListRemoveLastOccurence();
	}
	public static void linkedListRemove(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        System.out.println(listOne);
        //demonstrate remove() - It is used to retrieve and removes the first element of a list.
        //Both poll() and remove() method is used to remove head object of the Queue. 
        //The main difference lies when the Queue is empty(). If Queue is empty then poll() method will return null . 
        //While in similar case , remove() method will throw NoSuchElementException .
        listOne.remove();
        System.out.println(listOne);
        LinkedList<Integer> listBlank = new LinkedList<>();
        listBlank.remove(); // No such element exception if tried to remove from blank
        System.out.println(listBlank);
	}
	public static void linkedListRemoveIndex(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        System.out.println(listOne);
        //demonstrate remove(index) - It is used to remove the element at the specified position in a list.
        listOne.remove(2);
        System.out.println(listOne);
	}
	public static void linkedListRemoveLast(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        System.out.println(listOne);
        //demonstrate remove(index) - It is used to remove the last element of a list.
        listOne.removeLast();
        System.out.println(listOne);
        /* Output
         * [40, 10, 300, 1]
		 * [40, 10, 300]
         */
	}
	public static void linkedListRemoveLastOccurence(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        listOne.add(300); 
        listOne.add(1); 
        System.out.println(listOne);
        //demonstrate remove(index) - It is used to remove the last occurrence of element from a list.
        listOne.removeLastOccurrence(300);
        System.out.println(listOne);
        /* Output
         * [40, 10, 300, 1, 300, 1]
		 * [40, 10, 300, 1, 1]
         */
	}
	
}
