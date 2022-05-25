package CatAtributes;
import java.util.*;


public class listOrder {

	
		public static void main(String[] args) {
			
			List<cat> myCats = new ArrayList<>() {
				{
					add (new cat( " jon ",18, " black "));
					add (new cat( " simba ", 6, " white "));
					add (new cat( " jon ", 12," orange "));
				}
			};
			
			System.out.println("list of cats: \n");
			System.out.println(myCats);
			

			Collections.shuffle(myCats);
			
			System.out.println("\nrandomized list of cats: \n");
			System.out.println(myCats);
			
			
			Collections.sort(myCats);
			System.out.println("\nsorted list of cats: \n");
			System.out.println(myCats);
			
			
			Collections.sort(myCats, new ComparatorAge());
			System.out.println("\ncomparations between age of the cats -- the younger ones comes firt \n");
			System.out.println(myCats);
			
			
			System.out.println("\nComparation between the colour of the cats -- made through alphabetical order  \n");;
			myCats.sort(new ComparatorColour() );
			System.out.println(myCats);
		}
}
