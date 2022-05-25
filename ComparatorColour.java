package CatAtributes;

import java.util.Comparator;

public class ComparatorColour implements Comparator<cat>{

	@Override
	public int compare(cat o1, cat o2) {
		
		return o1.getColour().compareToIgnoreCase(o2.getColour());
	}
}
