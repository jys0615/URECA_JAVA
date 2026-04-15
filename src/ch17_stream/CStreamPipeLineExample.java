package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CStreamPipeLineExample {
	public static void main(String[] args) {
		List<CStudent> list = Arrays.asList(
				new CStudent("홍길동", 10),
				new CStudent("신용권", 20),
				new CStudent("유미선", 30)
		);		
		
		//방법1
//		Stream<Student> studentStream = list.stream();
//		//중간처리(학생 스트림을 점수 스트림으로 변환)
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore()); 
//		//최종 처리(평균 점수 계산)
//		double avg = scoreStream.average().getAsDouble(); 
		
		//방법2
		double avg = list.stream()
			.mapToInt(student -> student.getScore())
			.average()
			.getAsDouble();
		
		System.out.println("평균 점수: " + avg);
	}
}
