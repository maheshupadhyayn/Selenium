package arrayListPkg;

import java.util.ArrayList;

public class ArrayListRemoveElement {

	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<String>();
		listOne.add("Selenium"); // Simple add() method to add single element in list
		listOne.add("qtp");
		listOne.add("soapUI");
		listOne.add("qtp");
		System.out.println("my first iteration before removing -- "+ listOne );
		listOne.remove("qtp"); //It is used to remove the first occurrence of the specified element. 
		System.out.println("after removing single element -- "+listOne);
		listOne.addAll(listOne);
		System.out.println("after adding same list --" +listOne);
		//creating another list to remove from previous list
		ArrayList<String> listTwo = new ArrayList<String>();
		listTwo.add("Selenium");
		listTwo.add("qtp");
		
		listOne.removeAll(listTwo);
		System.out.println("after deleteing list within list --"+listOne);
		
		listOne.add(1,"qtp");//adding element at position 1
		System.out.println("after adding element -- "+listOne);
		listOne.remove(2);//removing element/object by index or position.
		System.out.println("after deleteing element or object from position -- "+listOne);
		listOne.addAll(listTwo); // adding list 2 with list 1
		System.out.println("after adding list within list-- "+listOne);
		//removeif - It is used to remove all the elements from the list that satisfies the given predicate.
		listOne.removeIf(str->str.contains("soapUI"));//using lambda we check condition
		System.out.println("after deleteing element with condition -- "+listOne);
	}
}
