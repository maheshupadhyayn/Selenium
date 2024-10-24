package linkedListPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPeek {

	public static void main(String[] args) {
		linkedListPeekLast();
	}
	public static void linkedListPeek(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate peek() - It retrieves the first element of a list
        System.out.println(listOne.peek()); //
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.print(itr.next()+",");
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.print(listBlank.peek());
        /*
         * output 
         * 40
		 * 40,10,300,1,null
         */
	}
	public static void linkedListPeekFirst(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate peekFirst() - It retrieves the first element of a list or returns null if a list is empty.
        System.out.println(listOne.peekFirst()); //
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.print(itr.next()+",");
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.print(listBlank.peekFirst());
        /*
         * output 
         * 40
		 * 40,10,300,1,null
         */
	}
	public static void linkedListPeekLast(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate peekLast() - It retrieves the last element of a list or returns null if a list is empty.
        System.out.println(listOne.peekLast()); //
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.print(itr.next()+",");
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.print(listBlank.peekLast());
        /*
         * output 
         * 1
		 * 40,10,300,1,null
         */
	}
}
