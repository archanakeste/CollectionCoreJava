import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	public static void main(String[] args) {
		
		  HashMap<Integer, String> hmap= new HashMap<Integer, String>();
	         hmap.put(2, "Anil");
	         hmap.put(44, "Ajit");
	         hmap.put(1, "Brad");
	         hmap.put(4, "Sachin");
	         hmap.put(88, "XYZ");

	         Set set = hmap.entrySet();
	             Iterator i = set.iterator();
	             // Display elements
	             while(i.hasNext()) {
	                Map.Entry me = (Map.Entry)i.next();
	                System.out.print(me.getKey() + ": ");
	      
	         }
	             
	             //sort using TreeMap
	             
	             Map map=new TreeMap(hmap);
	             

		         Set set1 = map.entrySet();
		             Iterator i1 = set1.iterator();
		             // Display elements
		             while(i1.hasNext()) {
		                Map.Entry me1 = (Map.Entry)i1.next();
		                System.out.print(me1.getKey() + ": ");
		      
		         }
	             
	             
	             
	}

}
