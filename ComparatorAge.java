package CatAtributes;

import java.util.Comparator;

public class ComparatorAge implements Comparator<cat>{

	@Override
	public int compare(cat o1, cat o2) {
		
		return Integer.compare(o1.getAge(), o2.getAge());
	}

	
	
		
}
