package linkedListPkg;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPopPush {

	public static void main(String[] args) {
		linkedListPop();
	}
	public static void linkedListPop(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate pop() - It pops/remove/take out an element from the stack represented by a list.
        //the element at the front of this list (which is the top of the stack represented by this list)
        //Method is equivalent to removeFirst()
        System.out.println(listOne.pop()+ " Pop"); //Pop() define in Deque
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.println(listBlank.pop()); // No Such element exception if list is blank
	}
	public static void linkedListPush(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate push() - It pushes an element onto the stack represented by a list.
        //inserts the element at the front of this list. 
        //Method equivalent to addFirst()
        listOne.push(20); //Push() define in Deque
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        listBlank.push(20);
        System.out.println(listBlank);
	}
	public static void diffAddOfferAddFirstPush(){
		Deque<Integer> arrayDeque = new ArrayDeque<>(); 

		// Add 3 at the tail of this deque
		arrayDeque.add(3);// -> [3]
		// Add 4 at the head of this deque
		arrayDeque.push(4);// -> [4, 3]
		// Add 6 at the tail of this deque
		arrayDeque.offer(6);// -> [4, 3, 6]
		// Add 2 at the head of this deque
		arrayDeque.addFirst(2);// -> [2, 4, 3, 6]
		// Add 5 at the tail of this deque
		arrayDeque.addLast(5);// -> [2, 4, 3, 6, 5]
		// Add 1 at the head of this deque
		arrayDeque.addFirst(1);// -> [1, 2, 4, 3, 6, 5]
		
		System.out.println("ArrayDeque: " + arrayDeque.toString());
	}
}
