import java.util.ArrayList;
import java.util.LinkedList;
public class LInkedListExample {
	public static void main(String[] args) {
		ArrayList< String> linkedList=new ArrayList<>();
		linkedList.add("g");
		linkedList.add("h");
		linkedList.add("i");
		linkedList.add("j");
		linkedList.add("k");
		linkedList.add("l");
		linkedList.add("m");
		linkedList.add("n");
		System.out.println(linkedList);
		//linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.remove(2);
		System.out.println(linkedList);
		//linkedList.remove();
		System.out.println(linkedList);
		linkedList.add(0, "archana");
		System.out.println(linkedList);
		long start=System.nanoTime();
		for(int i=0; i<linkedList.size();i++){
			System.out.println("  ++"+linkedList.get(i));
		}
		
		long end=System.nanoTime();
		
		System.out.println("time taken"+(end-start));
		
		
	}
}
