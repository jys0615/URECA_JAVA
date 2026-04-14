package ch15_collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JTreeSetObj implements Comparable<JTreeSetObj> { // 주소록 명단 객체

	String name;
	String tel;
	String memo;

	@Override
	public int compareTo( JTreeSetObj o ) {
		String s1 = this.name.toLowerCase();
		String s2 = o.name.toLowerCase();
		int i = s1.compareTo( s2 ); // 대소문자 구분 없이 비교
		if( i == 0 ) {
			return this.tel.compareTo( o.tel );
		}
		return i;
	}

} // class
