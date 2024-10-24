package linkedListPkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Java LinkedList class can contain duplicate elements.
 * Java LinkedList class maintains insertion order.
 * Java LinkedList class is non synchronized.
 * In Java LinkedList class, manipulation is fast because no shifting needs to occur.
 * Java LinkedList class can be used as a list, stack or queue.
 */

public class LinkedListAdd {

	public static void main(String[] args) {
		linkedListAddLast();
	}
	public static void linkedListAdd(){
		LinkedList<String> subjectList = new LinkedList<>();
		subjectList.add("maths");//Adding object/element in Linkedlist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//
		Iterator<String> itrNext = subjectList.iterator();
		while(itrNext.hasNext()){
			System.out.println(itrNext.next());
		}
	}
	public static void linkedListAddIndex(){
		LinkedList<String> subjectList = new LinkedList<>();
		subjectList.add("maths");//Adding object/element in Linkedlist  
		subjectList.add("physics");  
		subjectList.add("maths");  
		subjectList.add("english");  
		//
		Iterator<String> itrNext = subjectList.iterator();
		while(itrNext.hasNext()){
			System.out.println(itrNext.next());
		}
		subjectList.add(1,"biology");//adding element at 1st index (index start with 0)
		itrNext = subjectList.iterator();
		while(itrNext.hasNext()){
			System.out.println(itrNext.next());
		}
	}
	public static void linkedListAddAll(){
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add("Selenium"); // Simple add() method to add single element in list
		listOne.add("qtp");
		System.out.println("my first iteration before adding -- "+ listOne );
		
		//creating another LinkedList to demonstrate list addition into another list
		LinkedList<String> listTwo = new LinkedList();
		listTwo.add("rft");
		listTwo.add("jmeter");
		
		listOne.addAll(listTwo); // this will add all elements of listtwo at the end of listone.
		System.out.println("after adding all elements of listtwo in list one -- "+listOne);
		
		//creating third LinkedList to demonstrate how to add a list @ particular position
		LinkedList<String> listThree = new LinkedList<>();
		listThree.add("appium");
		listThree.add("selendroid");
		
		listOne.addAll(2, listThree);//Adding third list elements to the first list at specific position/index
		System.out.println("after adding list @ index 2 --- "+ listOne);
	}
	public static void linkedListAddFirst(){
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add("Selenium"); // Simple add() method to add single element in list
		listOne.add("qtp");
		System.out.println("my first iteration before adding -- "+ listOne );
				
		listOne.addFirst("rft"); // It is used to insert the given element at the beginning of a list.
		System.out.println("after adding elements at first in list one -- "+listOne);
	}
	public static void linkedListAddLast(){
		LinkedList<String> listOne = new LinkedList<String>();
		listOne.add("Selenium"); // Simple add() method to add single element in list
		listOne.add("qtp");
		System.out.println("my first iteration before adding -- "+ listOne );
				
		listOne.addLast("rft"); // It is used to append the given element to the end of a list.
		System.out.println("after adding element at end in list one -- "+listOne);
	}
	
}
