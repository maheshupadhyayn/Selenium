package stackPkg;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		stackPop();
	}
	public static void stackPush(){
		Stack<Integer> listOne = new Stack<>();
		listOne.add(30);
		listOne.add(1);
		listOne.add(23);
		listOne.add(200);
		System.out.println(listOne);
		listOne.push(111); // Pushes an element on the top of the stack.
		System.out.println(listOne);
	}
	public static void stackPop(){
		Stack<Integer> listOne = new Stack<>();
		listOne.add(30);
		listOne.add(1);
		listOne.add(23);
		listOne.add(200);
		System.out.println(listOne);
		listOne.pop(); // Pushes an element on the top of the stack.
		System.out.println(listOne);
	}
}
