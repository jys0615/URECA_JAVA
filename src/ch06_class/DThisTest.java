package ch06_class;

/*
 * this 키워드
 * 현재 객체 내부의 멤버변수나 멤버메소드를 참조하는(가리키는) 역할
 * 다른 생성자를 호출하는 역할 가능
 * this가 다른 생성자를 호출하는 역할을 하려면 반드시 생성자의 첫째줄에 있어야 한다
 */
public class DThisTest {

	String who;

	public DThisTest() {
//		System.out.println();
		this("아무것도 없는 생성자"); // String 하나를 받는 다른 생성자를 호출함
		//this가 다른 생성자를 호출하는 역할을 하려면 반드시 생성자의 첫째줄에 있어야 한다
	}

	public DThisTest(String who) {
		this.who = who;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
