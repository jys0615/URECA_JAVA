package ch07_inheritance;

public class APerson {

	private String name;
	private String ssn;
	private String tel;
	private String addr;
	private int age;

	public APerson() {}

	public APerson(String name, String ssn, String tel, String addr, int age) {
		this.name = name;
		this.ssn = ssn;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
	}

	public void print() {
		System.out.printf("이름 : %s , 주민번호 : %s , 전화번호 : %s , 주소 : %s , 나이 : %d \n"
							, name, ssn, tel, addr, age);
	}

}
