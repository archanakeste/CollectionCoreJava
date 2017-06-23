import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysTOArrayListExample {

	public static void main(String[] args) {
		
      String array[]={"one","two","three"};
      ArrayList< String> arrayList=new ArrayList<>(Arrays.asList(array));
      System.out.println("array List"+arrayList);
      
      
      ArrayList<String> list=new ArrayList<>();
Collections.addAll(list, array);

System.out.println("using collections class array are added to arraylisy "+list);
	}
}
