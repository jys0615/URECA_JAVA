package ch13_generic;

import ch07_inheritance.APerson;
import ch07_inheritance.AStudent;
import ch07_inheritance.ATeacher;

public class AGenericTest3 {

	public static void main(String[] args) {
//		AExtendsType<String> type1 = new AExtendsType<>(); // error
//		AExtendsType<Integer> type2 = new AExtendsType<>(); // error
		// AExtendsType은 APerson을 상속받은 객체만 만들 수 있다
		AExtendsType<APerson> type3 = new AExtendsType<>();
		AExtendsType<ATeacher> type4 = new AExtendsType<>();
		AExtendsType<AStudent> type5 = new AExtendsType<>();
	}

}
