import java.util.ArrayList;

public class ArrayListtoArrayExample {

	public static void main(String[] args) {
		
		ArrayList<String> friendsnames= new ArrayList<String>();
		friendsnames.add("Ankur");
		friendsnames.add("Ajeet");
		friendsnames.add("Harsh");
		friendsnames.add("John");

		String arrayStr[]=friendsnames.toArray(new String[friendsnames.size()]);
		
		System.out.println(" array :"+arrayStr.length);
		
		for(String s:arrayStr){
			System.out.println(" value is"+ s);
		}
	}

}
