package ch16_Lambda;

public class GPerson {
	public GMember getMember1(GCreatable1 creatable) {
		String id = "winter";
		GMember member = creatable.create(id);
		return member;
	}
	
	public GMember getMember2(GCreatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		GMember member = creatable.create(id, name);
		return member;
	}
}
