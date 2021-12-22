package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {

	public static void main(String[] args) {
ArrayList<Object> array=new ArrayList<Object>();
array.add("delhi");
array.add("goa");
array.add("mumbai");
array.add("rajastan");
array.add("kerela");
System.out.println("the arraylist before swapping:"+array);
	Collections.swap( array, 1, 3);
	System.out.println("the arraylist after swappying:");
	System.out.println(array);
}
	}

