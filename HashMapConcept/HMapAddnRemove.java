package HashMapConcept;

import java.util.HashMap;

public class HMapAddnRemove {

	public static void main(String[] args) {
HashMap <Integer,String> family=new HashMap <Integer,String>();
family.put(10, "amma");
family.put(20, "nana");
family.put(30, "bro");
family.put(40, "sis");
family.put(50, "me");
System.out.println("the hashmap list is:"+family);
System.out.println(family);
//here we get the value based on key
System.out.println("the element at 30th key :"+family.get(30));
//here we remove the key and value
System.out.println("the element at 50th key is removed:"+family.remove(50));
System.out.println(family);
}

}
