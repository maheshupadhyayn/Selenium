package arrayListPkg;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddElement {
	/*
	 * this class to demonstrate add() & addAll() method's with adding single element & list of elements.
	 */
	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<String>();
		listOne.add("Selenium"); // Simple add() method to add single element in list
		listOne.add("qtp");
		System.out.println("my first iteration before adding -- "+ listOne );
		listOne.add(1, "soapUI");//adding element at 1st index (index start with 0)
		System.out.println("after adding element to 1st index -- "+listOne );
		
		//creating another arraylist to demonstrate list addition into another list
		ArrayList<String> listTwo = new ArrayList();
		listTwo.add("rft");
		listTwo.add("jmeter");
		
		listOne.addAll(listTwo); // this will add all elements of listtwo at the end of listone.
		System.out.println("after adding all elements of listtwo in list one -- "+listOne);
		
		//creating third arraylist to demonstrate how to add a list @ particular position
		ArrayList<String> listThree = new ArrayList<>();
		listThree.add("appium");
		listThree.add("selendroid");
		
		listOne.addAll(2, listThree);//Adding third list elements to the first list at specific position/index
		System.out.println("after adding list @ index 2 --- "+ listOne);
		
	}

}
