package LinkedList;

import java.util.LinkedList;

public class AddnRemoveLinkedList {

	public static void main(String[] args) {
		LinkedList<Object> fruits=new LinkedList<Object>();
		 fruits.add("apple");
		 fruits.add("orange");
		 fruits.add("mango");
		 fruits.add("banana");
		 fruits.add("grape");
		 fruits.add("guava");
		System.out.println("the list of fruits are:"+fruits);
		for(Object link:fruits) {
			System.out.println(link);
		}
		fruits.remove();//it removes the first index position element
		System.out.println(fruits);
		fruits.remove(1);//it removes the 1st index position element
		System.out.println("after removing the 1st element:"+fruits);
	}

}
