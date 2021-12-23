package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRepresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> city=new LinkedList<Object>();
		city.add("hyderabad");
		city.add("bangalore");
		city.add("delhi");
		city.add("mumbai");
		System.out.println("the elements of list ar:"+city);
		//replace the 1st position
		city.addFirst("rajastan");
		////replace the last position
		city.addLast("punjab");
		//replace 3rd position
		city.add(3, "bihar");
		System.out.println("the linkedlist after updation :"+city);
			Iterator<Object> iterator=city.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	}

}
