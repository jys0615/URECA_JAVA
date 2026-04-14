package ch16_Lambda;

public class FMethodReferenceExample {
	public static void main(String[] args) {
		FPerson person = new FPerson();
		person.ordering(String :: compareToIgnoreCase);
	}
}
