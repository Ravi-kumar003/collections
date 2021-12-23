package LinkedList;

import java.util.LinkedList;

public class GetIndexInLinkedList {

	public static void main(String[] args) {
LinkedList<Object> heros=new LinkedList<Object>();
heros.add("prabhas");
heros.add("alluarjun");
heros.add("balayya");
heros.add("ntr");
heros.add("mahesh");
heros.add("pavankalyan");
System.out.println("linkedlist elements are:"+heros);
for(int i=0;i<heros.size();i++) {
	System.out.println("elements at index"+i+":is:"+heros.get(i));
	
}
System.out.println(heros.getFirst());
System.out.println(heros.getLast());
System.out.println(heros.get(2));
	}

}
