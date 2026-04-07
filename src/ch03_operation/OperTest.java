package ch03_operation;

public class OperTest {

	public static void main(String[] args) {
		// ++ : 숫자 하나 올림, -- : 숫자 하나 내림.
		int e = 5, f = 5;
		System.out.println(++e); 
		System.out.println(--f);

		// 전치 : 모든 다른 동작에 앞서 수행, 후치 : 모든 다른 동작이 끝나고 수행.
		int a = 7, b = 7, c = 0, d = 0; // 
		c = a++; // c에 a를 대입하고 a를 올림. 
		d = ++b; // b를 올리고 b를 d에 대입
		System.out.printf("a : %d, b : %d, c : %d, d : %d \n", a, b, c, d);

		a = 7;		b = 7;		c = 0;		d = 0;
		c = a++ + 8;
		d = ++b + 8;
		System.out.printf("a : %d, b : %d, c : %d, d : %d", a, b, c, d);


	} // main

}
