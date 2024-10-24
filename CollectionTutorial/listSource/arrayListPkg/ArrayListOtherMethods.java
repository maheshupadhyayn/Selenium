package arrayListPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ArrayListOtherMethods {

	public static void main(String[] args) {
		arrayListSubList();
	}
	public static void arrayListClear(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		System.out.println("before clear the list of objects/element -- "+listOne);
		//to demonstrate clear() - It is used to remove all of the elements from this list.
		listOne.clear();
		System.out.println("after clear the list -- "+listOne);
		//add another list to demonstrate removeAll
		ArrayList<String> listTwo = new ArrayList<>();
		listTwo.add("selenium");
		listTwo.add("qtp");
		listTwo.add("soapUI");
		listTwo.removeAll(listTwo); //It is used to remove all the elements from the list.
		System.out.println("after clear the list -- "+listTwo);
		/*Question in Interview - difference between removeAll(collection) & clear()
		clear() will go through the underlying Array and set each entry to null;
		removeAll(collection) will go through the ArrayList checking for collection and remove(Object) it if it exists.
		I would imagine that clear() is way faster then removeAll because it's not comparing, etc.
		Also removeAll will check if object/element contains in list.*/
	}
	public static void arrayListIsEmpty(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		// demonstrate isEmpty - it checks if list is empty, it return boolean value
		System.out.println(listOne.isEmpty());
		listOne.clear();
		System.out.println("after remove all elements from list, check list empty? -- "+listOne.isEmpty());
	}
	public static void arrayListLastIndexOf(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		listOne.add("qtp");
		// demonstrate lastIndexOf(object) - It is used to return the index in this list of the last occurrence of the specified element, 
		//or -1 if the list does not contain this element.
		System.out.println("checking last index of list--"+listOne.lastIndexOf(listOne));//we are checking last index of list so will return -1
		System.out.println("checking last index of object/element -- "+listOne.lastIndexOf("qtp"));
	}
	public static void arrayListContains(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		//demonstrate contains() - It returns true if the list contains the specified element.
		System.out.println("checking list contains qtp element -- "+listOne.contains("qtp"));
		ArrayList<String> listTwo = new ArrayList<>();
		listTwo.add("selenium");
		listTwo.add("qtp");
		listOne.addAll(listTwo);
		// returns false, because it check single element/object
		System.out.println("checking list contains another list -- "+listOne.contains(listTwo));
	}
	public static void arrayListIndexOf(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		listOne.add("qtp");
		//demonstrate indexOf() - It is used to return the index in this list of the first occurrence of the specified element, 
		//or -1 if the List does not contain this element.
		System.out.println("checking list indexOf qtp element -- "+listOne.indexOf("qtp"));
		System.out.println("checking list last index of qtp element -- "+listOne.lastIndexOf("qtp"));
	}
	public static void arrayListReplaceAll(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		listOne.add("qtp");
		//demonstrate replaceAll() - It is used to replace all the elements from the list with the specified element.
		listOne.replaceAll(e-> e.toUpperCase()); // operator is used to convert into uppercase
		Iterator<String> itr = listOne.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		listOne.replaceAll(e-> e.toLowerCase()); // operator is used to convert into lowercase
		itr = listOne.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		listOne.replaceAll(e-> e.toLowerCase(Locale.JAPANESE)); // operator is used to convert into lowercase(locale) - language
		itr = listOne.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		listOne.replaceAll(e-> e.toUpperCase(Locale.FRANCE)); // operator is used to convert into uppercase(locale) - language
		itr = listOne.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		// has all the methods from String class
		ArrayList<Integer> listTwo = new ArrayList<>();
		listTwo.add(1);
		listTwo.add(2);
		listTwo.add(4);
		listTwo.replaceAll(e-> e.intValue()); // here you will not see String methods
		
	}
	public static void arrayListClone(){
		ArrayList<String> listOne = new ArrayList<>();
		listOne.add("selenium");
		listOne.add("qtp");
		listOne.add("soapUI");
		ArrayList<String> listTwo = new ArrayList<>();
		listTwo = (ArrayList<String>) listOne.clone();//It is used to return a shallow copy of an ArrayList.
		Iterator<String> itr = listTwo.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	public static void arrayListToArray(){
		ArrayList<Integer> listOne = new ArrayList<Integer>(); 
        listOne.add(10); 
        listOne.add(20); 
        listOne.add(30); 
        listOne.add(40); 	  
        // Error: incompatible types: Object[] cannot be converted to Integer[] 
        Integer[] objects = (Integer[]) listOne.toArray(); 
        for (Integer obj : objects) {
            System.out.println(obj);
	    } 
	}
	public static void arrayListSort(){
		ArrayList<Integer> listOne = new ArrayList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate sort() - which is used to sort in ascending order
        Collections.sort(listOne); 
        System.out.println(listOne);
      //demonstrate sort() - which is used to sort in reverse order
        Collections.sort(listOne, Collections.reverseOrder()); 
        System.out.println(listOne);
        //Interview question for difference between Arrays.Sort() & Collection.sort()
        //Arrays.sort works for arrays which can be of primitive data type also. 
        //Collections.sort() works for objects Collections like ArrayList, LinkedList, etc.
	}
	public static void arrayListSubList(){
		ArrayList<Integer> listOne = new ArrayList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        listOne.add(330); 
        listOne.add(13); 
        listOne.add(200); 
        listOne.add(19); 
        System.out.println(listOne);
        //demonstrate subList() - It is used to fetch all the elements lies within the given range.
        List<Integer> listTwo = listOne.subList(1, 4);//starts from 1 and till at 4(exclude 4 index)
        System.out.println(listTwo);
	}
	public static void arrayListSortWithoutSort(){
		ArrayList<Integer> listOne = new ArrayList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1);
        listOne.add(44); 
        listOne.add(109); 
        listOne.add(30); 
        listOne.add(21);
        listOne.add(140); 
        listOne.add(105); 
        listOne.add(3300); 
        listOne.add(17);
        System.out.println(listOne);
        for(Integer i=0;i<listOne.size();i++){	
        	for(Integer j= i+1;j<listOne.size();j++){
        		if(listOne.get(i)>listOne.get(j)){
        			Integer temp = listOne.get(j);
        			listOne.set(j, listOne.get(i));
        			listOne.set(i, temp);
        		}
        	}
        }
        System.out.println(listOne);
        
	}
}


/*
 * Anything with ID you need to use "#"
 * Anything with Class you need to use "."
 * Anything with atribute, no need to use "//" & "@" rest all are same like xpath
 * "^" - prefix - attribute value starts with
 * "$" - suffix - attribute value ends with
 * "*" - Substring of any attribute value
 * 
 * Java Interview Questio
 * Selenium interview question
 * Resume Template
 * BDD Question
 * BDD lIst Video
 * Fresher Resume
 * Fresher Interview Question
 * CSV file code
 * API Automation question
 * Resume Building Video
 */
