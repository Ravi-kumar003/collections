package Collections;

import java.util.ArrayList;
import java.util.List;

public class CopyList {

	public static void main(String[] args) {
ArrayList<Integer> copy=new ArrayList<Integer>();
copy.add(10);
copy.add(20);
copy.add(30);
copy.add(40);
System.out.println("the arraylist is:"+copy);
List<Integer> values=new ArrayList<Integer>();
values.add(50);
values.add(60);
values.add(70);
copy.addAll(values);
System.out.println("the updated array list(copied) is:"+copy);
	}

}
