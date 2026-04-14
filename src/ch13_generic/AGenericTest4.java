package ch13_generic;

public class AGenericTest4 {

	public static void main(String[] args) {
		KeyValueType<Integer, String> test = new KeyValueType<>();
		test.setKey( 777 );
		test.setValue( "Lucky Number" );
		System.out.println( test.toString() );
	}

}
