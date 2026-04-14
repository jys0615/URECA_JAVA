package ch15_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EMapTest {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, 111);
		map.put('A', 222);
		map.put("third", 333);
		map.put("four", 'D');
		map.put(5, "hi");
		map.put('A', 777); // 키값이 같으면 value를 엎어친다

		System.out.println("map : " + map);
		System.out.println("map.size : " + map.size());
		System.out.println("map.containsKey : " + map.containsKey('A'));
		System.out.println("map.containsKey : " + map.containsKey('B'));
		System.out.println("map.containsValue : " + map.containsValue(777));
		System.out.println("map.containsValue : " + map.containsValue(888));

		Set keys = map.keySet();
		Iterator iter = keys.iterator();
		while( iter.hasNext() ) {
			Object key = iter.next();
			System.out.print( "key : " +  key);
			System.out.println( ", value : " + map.get( key ) );
		} // while

		Map map2 = new HashMap();
		map2.put(1, 111);
		map2.put('A', 222);

		Map map3 = new HashMap();
		map3.put(1, 111);
		map3.put('A', 222);

		map2.clear();
		map3.remove('A');

		System.out.println("map2 after clear : " + map2);
		System.out.println("map3 after remove : " + map3);
		System.out.println("map2.isEmpty : " + map2.isEmpty());
		System.out.println("map3.isEmpty : " + map3.isEmpty());

	} // main

}
