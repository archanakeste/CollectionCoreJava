import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExamples {
	
	public static void main(String args[]){
		
		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(4, "dd");
		hashMap.put(14, "we");
		hashMap.put(5, "gh");
		hashMap.put(2, "nm");
		hashMap.put(24, "ty");
		hashMap.put(34, "fg");
		
		
		System.out.println(""+hashMap);
		
		//Iterate
		Set<Entry<Integer, String>> set=hashMap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
			System.out.println(" "+entry.getKey()+"  "+entry.getValue());
		}
		
		//Get Value Based on Key
		hashMap.get(24);
		System.out.println("get value using key    "+hashMap.get(24));
		
	}
	
}
