package ch07_inheritance;

public class ATeacher extends APerson {

	private String subject;

	public ATeacher() {}

	// super() : 부모 생성자 호출, 생성자의 첫번째 줄에서만 호출 가능
	public ATeacher(String name, String ssn, String tel, String addr, int age, String subject) {
		super(name, ssn, tel, addr, age);
		this.subject = subject;
//		super(name, ssn, tel, addr, age); // error - 첫 번째 줄이 아니다
	}

	public String getSubject() {
		return subject;
	}

	public void print() {
		super.print(); // 부모 객체 내부에 존재하는 멤버 메서드 호출
		System.out.println(", 과목 : " + subject);
	}

}
