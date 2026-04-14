package ch15_collection;

public class JPerson implements Comparable<JPerson> {
	public String name;
	public int age;
	
	public JPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(JPerson o) {
		if(this.age < o.age) return -1; // 현재 객체가 비교 대상보다 나이가 작다
		else if(age == o.age) return 0; // 현재 객체와 비교 대상이 나이가 같다
		else return 1; // 현재 객체가 비교 대상보다 나이가 크다
	}
}
