import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInitialization {
	public static void main(String args[]){
		ArrayList<String> obj = new ArrayList<String>(
				Arrays.asList("Pratap", "Peter", "Harsh"));
			       System.out.println("Elements are:"+obj);

	//anonymous  class 
			       
			       ArrayList<String> arrayList=new ArrayList<String>(){{
			    	   add("dssds0");add("asas");
			    	   }
			       };
	
			       System.out.println("Elements are:"+arrayList);

	
			       
			       ArrayList<String> books = new ArrayList<String>();
				   books.add("Java Book1");
				   books.add("Java Book2");
				   books.add("Java Book3");
				  System.out.println("Books stored in array list are: "+books);
	}
	 
}
