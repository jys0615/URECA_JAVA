package ch17_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ISortingExample {
	public static void main(String[] args) {
		//List 컬렉션 생성
		List<IStudent> studentList = new ArrayList<>();
		studentList.add(new IStudent("홍길동", 30));
		studentList.add(new IStudent("신용권", 10));
		studentList.add(new IStudent("유미선", 20));
		
		//점수를 기준으로 오른차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted( )
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));	
		System.out.println();
		
		//점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));	
	}
}
