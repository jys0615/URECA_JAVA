package ch15_collection;

import java.util.TreeSet;

public class JComparableExample {
	public static void main(String[] args) {
		//TreeSet 컬렉션 생성
		TreeSet<JPerson> treeSet = new TreeSet<JPerson>();
		
		//객체 저장
		treeSet.add(new JPerson("홍길동", 45));
		treeSet.add(new JPerson("감자바", 25));
		treeSet.add(new JPerson("박지원", 31));
		
		//객체를 하나씩 가져오기		
		for(JPerson person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	} // main

}
