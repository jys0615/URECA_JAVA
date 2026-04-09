package ch07_inheritance;

public class CPoly1 {

	public static void main(String[] args) {

		// 일반적으로 변수는 선언된 참조타입의 객체 주소만 가질 수 있다
//		String s = new Scanner(System.in); // error

		// 상속 관계에서는 부모 타입의 변수는 자식 타입의 객체 주소를 가질 수 있다
		APerson p1 = new ATeacher("강감찬","123-456","010-9876-5432","서울",27,"수학");
		APerson p2 = new AStudent("홍길동","987-654","010-1234-5678","서울",24, 3, 1, 20);
		// Polymorphism : 다양한 형태를 의미 : 부모 타입의 변수는 여러 자식 타입의 객체 주소를 가질 수 있다 : 다형성

//		p1.getSubject(); // error - 부모 타입의 변수는 자식 객체의 고유한 영역은 알 수 없다.
		System.out.println("p1.print start");
		p1.print(); // 오버라이딩 메소드는 <부모 타입 변수>에서 <자식 타입 객체> 접근 가능
		System.out.println("p1.print end");
		// 자식 타입의 고유 영역에 접근하려면?? -> 부모 타입 변수를 자식 타입으로 변환 -> 명시적 Casting
		ATeacher t1 = (ATeacher) p1;
		t1.getSubject();

		// 다형성 사용 이유 1 - heterogeneous collection : 여러 타입의 객체를 담을 수 있는 배열
		// 1-1 다형성 이전
		ATeacher [] tArr = new ATeacher[10];
		AStudent [] sArr = new AStudent[10];
//		tArr[0] = new AStudent(); // error
//		sArr[0] = new ATeacher(); // error
		// 1-2 다형성 이후 - Person 매열 하나로 모든 자식을 담을 수 있다
		APerson [] pArr = new APerson[20];
		pArr[0] = new ATeacher();
		pArr[1] = new AStudent();

		// 다형성 사용 이유 2 - polymorphic argument
		polymorphicArgumentTest( new ATeacher() );
		polymorphicArgumentTest( new AStudent() );

	} // main

	public static void polymorphicArgumentTest(APerson p) {
		// instanceof 연산자 : 이 instance가 어떤 참조 타입인가를 판별
		if(p instanceof ATeacher) {
			System.out.println("ATeacher 객체");
		} else if(p instanceof AStudent) {
			System.out.println("AStudent 객체");
		}
	} // polymorphicArgumentTest

} // class
