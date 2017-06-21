import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
ArrayList<Integer> arrayList=new ArrayList();
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
arrayList.add(4);
arrayList.add(15);
arrayList.add(6);
arrayList.add(8);
arrayList.add(8);
arrayList.add(7);
arrayList.remove(6);

//System.out.println(" size of the array list is "+  arrayList.size());
//System.out.println(" size of the array list is "+  arrayList);

arrayList.set(0, 45);

//System.out.println(" size of the array list is "+  arrayList.size());
//System.out.println(" size of the array list is "+  arrayList);

Object[] arrOBJ=arrayList.toArray();
for (Object integer:arrOBJ){
	//System.out.println(" value is   "+integer.toString());
	
}


// Iterator is Thread safe and it is fail Fast : ant modification during iteration will cause to throw Concurrent Modification Exception
/*Iterator iterator=arrayList.iterator();
while(iterator.hasNext()){
	Integer integer=(Integer) iterator.next();
		arrayList.remove(new Integer("2"));
		
}*/


ListIterator<Integer> iterator2=arrayList.listIterator();

	
	/*System.out.println(iterator2.next());
	iterator2.add(new Integer("300"));
	//iterator2.set(new Integer("100"));
	//System.out.println(iterator2.previous());
*/
//System.out.println(" value "+arrayList);
/*while (iterator2.hasNext()){
	iterator2.next();
}
*/

while(iterator2.hasPrevious()){
	System.out.println(iterator2.previous());
}
	}
	
	

	
	

}
