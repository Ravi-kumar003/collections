package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class SubListInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		List list=fruits.subList(0,2 );

		System.out.println("the sublist of linkedlist:"+list);
			}
		

	}


