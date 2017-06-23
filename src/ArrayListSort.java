import java.util.ArrayList;
import java.util.Collections;

// using Collections class sort method
public class ArrayListSort {

	public static void main(String[] args) {

		
		 ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("China");
		   listofcountries.add("Denmark");

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		   
		   
Collections.sort(listofcountries);

 System.out.println("after sorting *****************:");
 
 for(String countries:listofcountries){
	 System.out.println(countries);
      }
 
	}

}
