import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSerializable {/*
	   public static void main(String [] args)
	      {
	           HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	           //Adding elements to HashMap
	           hmap.put(11, "AB");
	           hmap.put(2, "CD");
	           hmap.put(33, "EF");
	           hmap.put(9, "GH");
	           hmap.put(3, "IJ");
	           try
	           {
	                  FileOutputStream fos =
	                     new FileOutputStream("hashmap.ser");
	                  ObjectOutputStream oos = new ObjectOutputStream(fos);
	                  oos.writeObject(hmap);
	                  oos.close();
	                  fos.close();
	                  System.out.printf("Serialized HashMap data is saved in hashmap.ser");
	           }catch(IOException ioe)
	            {
	                  ioe.printStackTrace();
	            }
	      }
	

*/
	

	 public static void main(String [] args)
	   {
	      HashMap<Integer, String> map = null;
	      try
	      {
	         FileInputStream fis = new FileInputStream("hashmap.ser");
	         ObjectInputStream ois = new ObjectInputStream(fis);
	         map = (HashMap) ois.readObject();
	         ois.close();
	         fis.close();
	      }catch(IOException ioe)
	      {
	         ioe.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("Deserialized HashMap..");
	      // Display content using Iterator
	      Set set = map.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key: "+ mentry.getKey() + " & Value: ");
	         System.out.println(mentry.getValue());
	      }
	    }
	 }
