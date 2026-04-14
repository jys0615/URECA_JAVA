package ch15_collection;

import java.util.ArrayList;

public class AListTest {

	public static void main(String[] args) {

		ArrayList origin1 = new ArrayList();
		origin1.add(777);
		origin1.add("Three");
		origin1.add(3.14);
		origin1.add("Three");
		origin1.add(false);

		ArrayList clone1 = (ArrayList) origin1.clone();
		ArrayList clone2 = (ArrayList) origin1.clone();
		ArrayList clone3 = (ArrayList) origin1.clone();

		System.out.println( "origin1.toString : " + origin1.toString() );
		System.out.println( "clone1.toString : " + clone1.toString() );
		System.out.println( "clone2.toString : " + clone2.toString() );
		System.out.println( "clone3.toString : " + clone3.toString() );
		System.out.println( "origin1.size : " + origin1.size() );
		System.out.println( "origin1.indexOf : " + origin1.indexOf("Three") );
		System.out.println( "origin1.lastIndexOf : " + origin1.lastIndexOf("Three") );

		Object objArr[] = origin1.toArray();
		for (Object object : objArr) {
			System.out.println( object );
		}

		clone1.clear();
		System.out.println( "clone1.toString after clear : " + clone1.toString() );

		clone2.remove(0);
		clone2.remove("Three");
		System.out.println( "clone2.toString : " + clone2.toString() );

		clone2.add("Four"); // 마지막에 추가
		clone2.add(1, "First");
		clone2.add(0, "Before First");
		System.out.println( "clone2.toString after add : " + clone2.toString() );

		System.out.println("clone2.contains : " + clone2.contains(3.14));
		System.out.println("clone1.contains : " + clone1.isEmpty());
		System.out.println("clone2.contains : " + clone2.isEmpty());

		for (int i = 0; i < clone2.size(); i++) {
			System.out.println( i + " : " + clone2.get(i) );
		} // for

	} // main

} // class
