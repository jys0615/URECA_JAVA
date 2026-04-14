package ch15_collection;

import java.util.TreeSet;

public class JTreeSetObjTest {

	public static void main(String[] args) {

		// implements Comparable를 한 객체만 TreeSet에 들어감
		TreeSet<JTreeSetObj> set = new TreeSet<>();
		set.add( new JTreeSetObj("SMITH", "010-1234-5678", "test1") );
		set.add( new JTreeSetObj("JAMES", "010-2345-6789", "test2") );
		set.add( new JTreeSetObj("adams", "010-3456-7889", "test3") );
		set.add( new JTreeSetObj("adams", "010-3456-7891", "test3") );
		set.add( new JTreeSetObj("ADAMS", "010-3456-7890", "test3") );

		for (JTreeSetObj obj : set) {
			System.out.println(obj);
		}

	} // main

}
