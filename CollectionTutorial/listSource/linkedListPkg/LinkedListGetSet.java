package linkedListPkg;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListGetSet {

	public static void main(String[] args) {
		linkedListElement();
	
	}
	public static void linkedListGetSet(){
		LinkedList<String> listOne = new LinkedList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		System.out.println("after adding all elements to listOne -- "+listOne);
		//demonstrate Get() - It is used to fetch the element from the particular position of the list.
		System.out.println(listOne.get(1));
		//demonstrate Set() - It is used to replace the specified element in the list, present at the specified position.
		listOne.set(1, "appium");
		System.out.println("after setting element at particular position to listOne -- "+listOne);
		//demonstrate add(index, element) - It is used to insert the specified element at the specified position in a list without replacing
		listOne.add(1, "qtp");
		System.out.println("after adding element at particular position to listOne -- "+listOne);
	}
	public static void linkedListGetFirst(){
		LinkedList<String> listOne = new LinkedList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		System.out.println("after adding all elements to listOne -- "+listOne);
		//demonstrate GetFirst() - It is used to return the first element in a list.
		System.out.println(listOne.getFirst());
	}
	public static void linkedListGetLast(){
		LinkedList<String> listOne = new LinkedList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		System.out.println("after adding all elements to listOne -- "+listOne);
		//demonstrate GetFirst() - It is used to return the last element in a list.
		System.out.println(listOne.getLast());
	}
	public static void linkedListElement(){
		LinkedList<String> listOne = new LinkedList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		System.out.println("after adding all elements to listOne -- "+listOne);
		//demonstrate element() - It is used to retrieve the first element of a list.
		System.out.println(listOne.element());
	}
}
