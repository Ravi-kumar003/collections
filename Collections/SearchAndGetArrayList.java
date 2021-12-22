package Collections;

import java.util.ArrayList;

public class SearchAndGetArrayList {

	public static void main(String[] args) {
		//here we create a object
ArrayList<String> alpha=new ArrayList<String>();
//here we add one string to another
alpha.add("MOM");
alpha.add("DAD");
alpha.add("SIS");
alpha.add("BRO");
alpha.add("BAVA");
alpha.add("AMMAMMA");
System.out.println("+++++++the index positions of above arraylist+++++++++++");
//here we print the index position of elements from arraylist
System.out.println("the index position of mom in arraylists are:"+alpha.lastIndexOf("MOM"));
System.out.println("the index position of dad in arraylists are:"+alpha.lastIndexOf("DAD"));
System.out.println("the index position of sis in arraylists are:"+alpha.lastIndexOf("SIS"));
System.out.println("the index position of bro in arraylists are:"+alpha.lastIndexOf("BRO"));
System.out.println("the index position of bava in arraylists are:"+alpha.lastIndexOf("BAVA"));
System.out.println("********************");
//here we print the elements based on the index position
System.out.println("the elements in the index position 1:"+alpha.get(0));
System.out.println("the elements in the index position 2:"+alpha.get(2));
System.out.println("the elements in the index position 3:"+alpha.get(3));
System.out.println("the elements in the index position 4:"+alpha.get(4));
	}

}
