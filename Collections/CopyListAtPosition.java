package Collections;
//import from libraries
import java.util.ArrayList;
import java.util.List;

public class CopyListAtPosition {

	public static void main(String[] args) {
		//we need to create a object here
ArrayList<String> copy=new ArrayList<String>();
//create a array list
copy.add("A");
copy.add("B");
copy.add("C");
copy.add("D");
System.out.println("the first arraylist before copying:"+copy);
//we need to create another array list
List<String> data=new ArrayList<String>();
data.add("E");
data.add("F");
data.add("G");
System.out.println("the second  arraylist before copying:"+data);
//here we are copying the arraylist of copy at 4th position
copy.addAll(4,data);
System.out.println("tha arralist after copying(first+second):"+copy);
	}

}
