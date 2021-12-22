package Collections;

import java.util.ArrayList;
import java.util.List;

public class CopyTwoDiffArrayList {

	public static void main(String[] args) {
ArrayList<Object> copy=new ArrayList<Object>();
//create a arraylist
copy.add("ravi");
copy.add("vineeth");
copy.add("umaa");
copy.add("narender");
//print the arralist
System.out.println("the arraylist before copy are:"+copy);
List<Integer> ram=new ArrayList<Integer>();
ram.add(10);
ram.add(20);
ram.add(30);
ram.add(40);
System.out.println("the second arraylist is:"+ram);
//adding the two arraylists
copy.addAll(ram);
System.out.println("the arraylist after copying :"+copy);
	}

}
