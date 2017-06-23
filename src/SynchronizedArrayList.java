import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		// for thread safe we need to use  either CopyonWriteArrayList or Collections.syncronizedLIst
		
		List<String> syncal=Collections.synchronizedList(new ArrayList<String>());
		 //Adding elements to synchronized ArrayList
	       syncal.add("Pen");
	       syncal.add("NoteBook");
	       syncal.add("Ink");

	       System.out.println("Iterating synchronized ArrayList:");
	       synchronized(syncal) {
	       Iterator<String> iterator = syncal.iterator(); 
	       while (iterator.hasNext())
	          System.out.println(iterator.next());
	       }
		

	       
	       // CopyonWrite
	       
	       List<String> al=new CopyOnWriteArrayList<>();
	       al.add("Pen");
	       al.add("NoteBook");
	       al.add("Ink");
	       
	       System.out.println(" Displaying Syncronized block elements");
	       
	     Iterator itr=al.iterator();
	     
	     while(itr.hasNext()){
	    	String s=(String) itr.next();
	    	System.out.println(s);
	     }
	}

}
