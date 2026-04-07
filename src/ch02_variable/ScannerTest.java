package ch02_variable;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		int a = 7;
		// 저장 공간에 32비트 정수를 담을 수 있는 공간을 만들고, 7을 대입

		String s = new String("hi");
		// 1. String s : 저장공간에 <String 형태의 저장된 내용>을 참조할 수 있는 변수 이름 s를 선언
		// 2. s = new String : 저장공간에 <String 형태의 저장된 내용>을 만들어서 s에 저장 공간 주소를 대입
		// 3. String("hi") : String의 생성자 호출

		Scanner scan = new Scanner(System.in); // 새로 복사하는 객체를 만들었는데 System.in을 참조하는 객체를 만들어서 대입.
		// System : 현재 시스템을 나타내는 변수들을 저장한 객체 또는 클래스
		// . : 객체나 클래스 내부를 가르키는 명령어(키워드)
		// in : 입력 버퍼 (메모리, 입력 대기열 - 키보드를 통해서 전달된 값들이 저장된 공간)
		// new Scanner(System.in) : 입력 버퍼의 데이터를 가져오는 역할을 하는 객체를 새로 만드는 표현
		// System.out : 현재 프로그램이 동작하는 시스템 내부의 출력 버퍼
		// out : 출력 버퍼를 대표하는 변수들을 가진 객체
		// out.print : 출력 버퍼 객체 내부의 출력 기능(메소드)
		// ln : line new (줄바꿈)

		System.out.print("정수 입력 : ");
//		scan.nextByte();
//		scan.nextShort();
//		scan.nextLong();
		int iVar = scan.nextInt();
		System.out.println("입력된 정수 : " + iVar);

		System.out.print("실수 입력 : ");
//		scan.nextFloat();
		double dVar = scan.nextDouble();
		System.out.println("입력된 실수 : " + dVar);

		System.out.print("단어 입력 : ");
		String word = scan.next();
		System.out.println("입력된 단어 : " + word);
//		String word2 = scan.next();
//		System.out.println("입력된 단어2 : " + word2);

		System.out.print("한줄 입력 : ");
		String wordLine = scan.nextLine();
		System.out.println("입력된 한줄 : " + wordLine);

		scan.close();
	} // main

} // class
