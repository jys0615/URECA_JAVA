package ch11_exception;

/* Exception : 의도하지 않은 상황
 * 유저가 파일명을 오타 입력 -> FileNotFoundException
 * 5 / 0 -> ArithmaticException
 * array의 없는 번지에 접근 -> ArrayIndexOutOfException
 * 코딩할 때 예상치 못했던 상황, 조작 실수
 * Exception Handling -> 예외에도 정상 동작하도록 | 예외 안내 | 예외 로그 | 안전한 종료가 목적
 */
public class AExceptTest1 {

	public static void main(String[] args) {

		try {
			Class.forName("CH09.AOuterClass1");
			int i = 5 / 1;
			String [] sArr = {"hi", "hello"};
//			System.out.println(sArr[5]);
			String str = "hi";
//			System.out.println(str.charAt(5));
			String str2 = null;
			System.out.println(str2.length());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException 발생");
			e.printStackTrace(); // exception 추적 로그 출력
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		} catch (IndexOutOfBoundsException e) { // polymorphic argument
			if(e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("ArrayIndexOutOfBoundsException 발생");
			else if(e instanceof StringIndexOutOfBoundsException)
				System.out.println("StringIndexOutOfBoundsException 발생");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}

	} // main

}
