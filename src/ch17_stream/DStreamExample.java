package ch17_stream;

import java.util.stream.IntStream;

public class DStreamExample {
	public static int sum;
	
	public static void main(String[] args) {
//		IntStream stream = IntStream.range(1,  100); // 100 불포함.
		IntStream stream = IntStream.rangeClosed(1,  100); // 100 포함.
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}
}



