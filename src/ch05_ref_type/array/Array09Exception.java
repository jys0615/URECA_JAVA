package ch05_ref_type.array;

public class Array09Exception {

	public static void main(String[] args) {

		int [] arr = new int [2];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//System.out.println(arr[2]); // ArrayIndexOutOfBoundsException

		String s = new String("hi");
		//System.out.println(s.charAt(3)); // StringIndexOutOfBoundsException

	} // main

}
