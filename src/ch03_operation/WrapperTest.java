package ch03_operation;

/*
 * Wrapper class
 * primitive data type을 객체로 다루기 위해 만들어진 클래스
 * 객체 사이에서 primitive data type을 다루기 위해 만들어진 클래스
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * char : Character
 * float : Float
 * double : Double
 * boolean : Boolean
 */
public class WrapperTest {
	public static void main(String[] args) {

//		Integer iVar = new Integer(100); //deprecated
		Integer iVar = Integer.valueOf(100);
		System.out.println(iVar);

		String s = "12345";
		double tmpDouble = Double.parseDouble(s);
		System.out.println(tmpDouble);

		Integer iVar2 = Integer.valueOf(200);
		System.out.println(iVar + iVar2);

		int intVar = Integer.parseInt(s);
		System.out.println(intVar);

		byte b = iVar2.byteValue();
		short sh = iVar2.shortValue();
		long lo = iVar2.longValue();
		float fl = iVar2.floatValue();
		double dou = iVar2.doubleValue();
		System.out.printf("b : %d, sh : %d, lo : %d, fl : %f, dou : %f", b, sh, lo, fl, dou);
	}

}
