import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//  Serialize an array list  By default arraList is serialized



public class SerializeArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	       al.add("Hello");
	       al.add("Hi");
	       al.add("Howdy");

	       try{
	         FileOutputStream fos= new FileOutputStream("temp1");
	         ObjectOutputStream oos= new ObjectOutputStream(fos);
	         oos.writeObject(al);
	         oos.close();
	         fos.close();
	       }catch(IOException ioe){
	            ioe.printStackTrace();
	        }

		
	}

}
