package ch15_collection;

import java.util.Comparator;
import java.util.TreeSet;

public class KComparatorExample {
	public static void main(String[] args) {
		//비교자를 제공한 TreeSet 컬렉션 생성
//		TreeSet<KFruit> treeSet = new TreeSet<KFruit>(new KFruitComparator());
		TreeSet<KFruit> treeSet = new TreeSet<KFruit>(new Comparator<KFruit>() {
			@Override
			public int compare(KFruit o1, KFruit o2) {
				if(o1.price < o2.price) return -1;
				else if (o1.price == o2.price) return 0; 
				else return 1;
			}
		});
		
		//객체 저장
		treeSet.add(new KFruit("포도", 3000));
		treeSet.add(new KFruit("수박", 10000));		
		treeSet.add(new KFruit("딸기", 6000));
		
		//객체를 하나씩 가져오기
		for(KFruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}
}
