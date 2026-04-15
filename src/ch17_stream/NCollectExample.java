package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NCollectExample {
	public static void main(String[] args) {
		List<NStudent> totalList = new ArrayList<>();
		totalList.add(new NStudent("홍길동", "남", 92));
		totalList.add(new NStudent("김수영", "여", 87));
		totalList.add(new NStudent("감자바", "남", 95));
		totalList.add(new NStudent("오해영", "여", 93));
		
		Map<String, List<NStudent>> map = totalList.stream()
				.collect(
					Collectors.groupingBy(s -> s.getSex())
				);
		System.out.println(map);
		System.out.println();

		List<NStudent> maleList = map.get("남");
		maleList.stream()	.forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<NStudent> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}
}
