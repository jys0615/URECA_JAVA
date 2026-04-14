package ch15_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DSetTest {

	public static void main(String[] args) {

		Set origin = new HashSet();
		origin.add(777);
		origin.add("Three");
		origin.add(3.14);
		origin.add("Three");
		origin.add(false);
		origin.add(Integer.valueOf(777));
		origin.add("Four");
		origin.add("First");
		origin.add("Before First");

		System.out.println("origin : " + origin);
		System.out.println("origin.size() : " + origin.size());
		System.out.println("origin.contains(four) : " + origin.contains("four"));
		System.out.println("origin.contains(Four) : " + origin.contains("Four"));
		System.out.println("origin.contains(Five) : " + origin.contains("Five"));

		Object [] oArr = origin.toArray();
		for (int i = 0; i < oArr.length; i++) {
			System.out.println( "oArr : " + oArr[i] );
		} // for

		Iterator iter = origin.iterator();
		while(iter.hasNext()) {
			System.out.println( "iter.next : " + iter.next() );
		} // while

		Set set2 = new HashSet();
		set2.add(777);
		set2.add("Three");
		set2.add(3.14);

		Set set3 = new HashSet();
		set3.add(777);
		set3.add("Three");
		set3.add(3.14);

		System.out.println("set2 : " + set2);
		System.out.println("set3 : " + set3);

		set2.clear();
		System.out.println("set2 after clear : " + set2);
		System.out.println("set2 isEmpty : " + set2.isEmpty());
		System.out.println("set3 isEmpty : " + set3.isEmpty());

		set3.remove(3.14);
		System.out.println("set3 remove 3.14 : " + set3);

	} // main

}











