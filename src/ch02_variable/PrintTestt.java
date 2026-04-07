package ch02_variable;

public class PrintTestt {

	public static void main(String[] args) {
		System.out.print("Hi\t");
		System.out.print("Hello\n"); // print는 줄바꿈을 안해준다.
		System.out.print("Hoe are you");
		System.out.println(); // print 완료 후 line new
		System.out.printf("%s이 %s에게 %d만원을 년이자 %f에 빌렸다.\n", "홍길동", "국민은행", 200, 3.14);

		System.out.printf("%6d\n", 200);
		System.out.printf("%-6d\n", 200);
		System.out.printf("%06d\n", 200);
		System.out.printf("%s이 %s에게 %d만원을 년이자 %10.3f에 빌렸다.\n", "홍길동", "국민은행", 200, 3.14);
	} //main

}
