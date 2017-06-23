import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaploop {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(4, "dd");
		hashMap.put(14, "we");
		hashMap.put(5, "gh");
		hashMap.put(2, "nm");
		hashMap.put(24, "ty");
		hashMap.put(34, "fg");
		
		
		System.out.println(""+hashMap);
		
		for(Map.Entry entry:hashMap.entrySet()){
			System.out.println(""+entry.getKey());
			System.out.println(""+entry.getValue());
		}

		
		Iterator itr=hashMap.entrySet().iterator();
		
		while(itr.hasNext()){
		Map.Entry entry=(Entry) itr.next();
		System.out.println(" keys are "+entry.getKey() +"  and values are "+entry.getValue());
		}
	}

}
