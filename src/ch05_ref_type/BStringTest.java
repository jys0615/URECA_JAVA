package ch05_ref_type;

public class BStringTest {

	public static void main(String[] args) {

		String origin = new String("hi hello how are you nice to meet you");
		System.out.println(origin.length()); // length : 37, index : 0 ~ length-1

		System.out.println(origin.concat(" : 인사"));
		System.out.println(origin + " : 인사");
		System.out.println(origin + new String(" : 인사"));

		System.out.println(origin.replace('i', 'A'));
		System.out.println(origin.replace("you", "U~~"));
		System.out.println(origin.replaceAll("i", "A"));
		System.out.println(origin.replaceFirst("i", "A"));

		System.out.println(origin.substring(9)); // 9번지부터 끝까지
		System.out.println(origin.substring(3 , 7)); // 앞 번지 포함, 뒷 번지 불포함.

		System.out.println(origin.indexOf('i')); // 앞에서 뒤로 검색
		System.out.println(origin.lastIndexOf('i')); // 뒤에서 앞으로 검색
		System.out.println(origin.indexOf("you"));
		System.out.println(origin.lastIndexOf("you"));

		System.out.println("origin : " + origin);
		// 스트링의 메소드를 통해 문자열을 바꾸면, 새로 저장하지 않는 경우, 원본은 변하지 않는다

		String target = new String("봄 여름 가을 겨울");
		String [] sArr = target.split(" ");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		} // for
		for (String string : sArr) {
			System.out.println(string);
		} // for

	} //main

}
