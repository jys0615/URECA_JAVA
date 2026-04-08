package ch06_class;

public class BMethodTest3 {

	String statusFlag;

	public static void main(String[] args) {

		BMethodTest3 test = new BMethodTest3();
		test.sum1(777, 888);
		int c = test.sum2(777, 888);
		System.out.println("sum2 : " + c);

	} // main

	// (int a, int b) : 파라미터, arguments list
	// 메소드 실행에 필요한 데이터를 외부로부터 받는 공간
	public void sum1(int a, int b) {
		statusFlag = "sum1";
		System.out.println("sum1 : " + (a + b));
	} // sum1

	public int sum2(int a, int b) { // void : 현재 메소드는 돌랴보낼 데이터가 없음
		statusFlag = "sum2";
		return a + b; // 현재 메소드를 호출한 라인으로 데이터를 보내는 표현
//		System.out.println(); // error - 끝을 의미하는 return 다음에 있어서 실행되지 않음. 리턴 다음에는 어떤 코드도 올 수 없음. 
	} // sum2

} //class





