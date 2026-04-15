package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MCollectExample {
	public static void main(String[] args) {
		List<MStudent> totalList = new ArrayList<>();
		totalList.add(new MStudent("홍길동", "남", 92));
		totalList.add(new MStudent("김수영", "여", 87));
		totalList.add(new MStudent("감자바", "남", 95));
		totalList.add(new MStudent("오해영", "여", 93));
		
		//남학생들만 묶어 List 생성
		List<MStudent> maleList = totalList.stream()
				.filter(s->s.getSex().equals("남"))
				.collect(Collectors.toList());
//		List<Student> maleList = totalList.stream()
//				.filter(s->s.getSex().equals("남"))
//				.toList();
		
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//학생 이름을 키로 Student 객체를 값으로 갖는 Map 생성
		Map<String, Integer> map = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(),  //Student 객체에서 키가 될 부분 리턴
						s -> s.getScore()   //Student 객체에서 값이 될 부분 리턴
					)
				);
		
		System.out.println(map);
	}
}
