package ch15_collection;

import java.util.Comparator;

public class KFruitComparator implements Comparator<KFruit> {
	@Override
	public int compare(KFruit o1, KFruit o2) {
		if(o1.price < o2.price) return -1;
		else if(o1.price == o2.price) return 0;
		else return 1;	
	}
}


