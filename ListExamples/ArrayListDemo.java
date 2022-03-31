import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> s = new ArrayList<String>();
		s.add("First");
		//Add(int,value) :  When we wanted to add in specific index position
		s.add(1,"Second");
		
		List<String> s1 = new ArrayList<String>();
		s1.add("1");
		s1.add("2");
		s1.add("3");
		System.out.println("s="+s+" size="+s.size());
		System.out.println("s1="+s1+" Size s1="+s1.size());
		//add all demo
		s.addAll(s1);
		System.out.println("s="+s+" size="+s.size());
		System.out.println("s1="+s1+" Size s1="+s1.size());
		s.addAll(1, s1);
		System.out.println("s="+s+" size="+s.size());
		System.out.println("s1="+s1+" Size s1="+s1.size());
		List<String> s2 = new ArrayList<String>();
		System.out.println(s.isEmpty()+" "+s2.isEmpty());
		System.out.println(s1.contains("1"));
		System.out.println(s1.containsAll(s));
		s.remove("First");
		s.remove("Second");
		System.out.println("Removed s="+s);
		System.out.println("Get value "+s.get(1));
		s.set(4, "first");
		s.add("1");
		s.add("8");
		System.out.println(s.indexOf("first"));
		System.out.println(s.lastIndexOf("1"));
		System.out.println("Set s="+s);
		System.out.println("After removing "+s1.containsAll(s));
		System.out.println("Num of occurances of 1 in s ="+Collections.frequency(s, "1"));
		
	}

}
