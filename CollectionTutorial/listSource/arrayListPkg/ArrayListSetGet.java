package arrayListPkg;

import java.util.ArrayList;

public class ArrayListSetGet {

	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<>();
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

}