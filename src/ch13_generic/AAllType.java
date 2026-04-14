package ch13_generic;

public class AAllType<T> { // T : Type

	// AAllType<Integer> allInt = new AAllType<>();
	// AAllType<String> allStr = new AAllType<>();
	private T member;

	public AAllType() {}

	public AAllType( T member ) {this.member = member;}

	public T getMember() {
		return this.member;
	}

	public void setMember( T member ) {
		this.member = member;
	}

} // class
