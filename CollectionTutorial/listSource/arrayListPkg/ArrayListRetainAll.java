package arrayListPkg;

import java.util.ArrayList;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		System.out.println("after adding all elements to listOne -- "+listOne);
		//creating another list to demonstrate retainAll function
		ArrayList<String> listTwo = new ArrayList<>();
		listTwo.add("qtp");
		listTwo.add("appium");
		listTwo.add("selendroid");
		System.out.println("after adding all elements to listTwo -- "+listTwo);
		//demonstrate retainAll - It is used to retain all the elements in the list that are present in the specified collection.
		//it will retain only common element/objet from both the list rest are removed.
		listOne.retainAll(listTwo);
		System.out.println("after implementing retail all listTwo over listOne -- "+listOne);
	}

}
