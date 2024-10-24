package linkedListPkg;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedListOffer {

	public static void main(String[] args) {
		linkedListOfferFirst();
	}
	public static void linkedListOffer(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        listOne.offer(2); //
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        /* Interview Question - difference between offer() and add()
         * he two functions come from two different interfaces that PriorityQueue implements:
		 * add() comes from Collection & offer() comes from Queue.
		 * For a capacity-constrained queue, the difference is that add() always returns true and throws an exception if it can't add the element, 
		 * whereas offer() is allowed to return false if it can't add the element.
         */
        //Capacity-constrained Queue example
        LinkedBlockingQueue<Integer> listTwo = new LinkedBlockingQueue<>(3);
        listTwo.add(40); 
        listTwo.add(10); 
        listTwo.add(300); 
        System.out.println(listTwo.offer(99)); // this print false, because it is over it's capacity
        System.out.println(listTwo.add(88)); // this print exception, it won't allows and throw exception.
	}
	public static void linkedListOfferFirst(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate offerFirst() - It inserts the specified element at the front of a list.
        listOne.offerFirst(2); //
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}
	public static void linkedListOfferLast(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate offerLast() - It inserts the specified element at the end of a list.
        listOne.offerLast(2); 
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
	}
}
