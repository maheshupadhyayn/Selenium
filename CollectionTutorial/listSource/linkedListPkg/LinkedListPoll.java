package linkedListPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPoll {

	public static void main(String[] args) {
		linkedListPollLast();
	}
	public static void linkedListPoll(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate poll() - It retrieves and romoves the first element of a list
        System.out.println(listOne.poll()); 
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.print(itr.next()+",");
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.print(listBlank.poll());
        /*
         * output 
         * 40
		 * 10,300,1,null
         */
	}
	public static void linkedListPollFirst(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate pollFirst() - It retrieves & removes the first element of a list or returns null if a list is empty.
        System.out.println(listOne.pollFirst()); 
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.print(itr.next()+",");
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.print(listBlank.pollFirst());
        /*
         * output 
         * 40
		 * 10,300,1,null
         */
	}
	public static void linkedListPollLast(){
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		listOne.add(40); 
        listOne.add(10); 
        listOne.add(300); 
        listOne.add(1); 
        //demonstrate pollLast() - It retrieves & removes the last element of a list or returns null if a list is empty.
        System.out.println(listOne.pollLast()); 
        Iterator<Integer> itr = listOne.iterator();
        while(itr.hasNext()){
        	System.out.print(itr.next()+",");
        }
        LinkedList<Integer> listBlank = new LinkedList<>();
        System.out.print(listBlank.pollLast());
        /*
         * output 
         * 40
		 * 40,10,300,null
         */
	}
}
