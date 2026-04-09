package ch06_class;

public class ISingletonExample {
	public static void main(String[] args) {
		/*
		ISingleton obj1 = new ISingleton();  //컴파일 에러
		ISingleton obj2 = new ISingleton();  //컴파일 에러
		*/
		
		//정적 메소드를 호출해서 싱글톤 객체 얻
		ISingleton obj1 = ISingleton.getInstance();
		ISingleton obj2 = ISingleton.getInstance();
		
		//동일한 객체를 참조하는지 확
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
