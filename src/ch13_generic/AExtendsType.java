package ch13_generic;

import ch07_inheritance.APerson;

// APerson을 상속 받은 객체만 member의 Data Type이 된다
public class AExtendsType<T extends APerson> {

	private T member;

	public T getMember() {
		return this.member;
	}

	public void setMember( T member ) {
		this.member = member;
	}

}
