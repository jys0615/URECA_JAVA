package ch16_Lambda;

public class GConstructorReferenceExample {
	public static void main(String[] args) {
		GPerson person = new GPerson();
		
		GMember m1 = person.getMember1(GMember :: new);
		System.out.println(m1);
		System.out.println();

		GMember m2 = person.getMember2(GMember :: new);
		System.out.println(m2);
	}
}

