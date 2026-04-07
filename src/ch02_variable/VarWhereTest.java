package ch02_variable;

public class VarWhereTest {

	static int var1 = 111;

	public static void main(String[] args) {

		int var1 = 777;
		{
			int var2 = 888;
			System.out.println(var1);
			System.out.println(var2);
		}
		// 멤버 변수와 지역변수가 이름이 같을 때, 지역 변수 우선됨
		System.out.println(var1);
		// 지역 변수는 자신을 둘러싼 {} 안에서만 의미를 갖는다
		//System.out.println(var2); //error
		{
			int var2 = 999;
			System.out.println(var1);
			System.out.println(var2);
		}

	} // main

} // class
