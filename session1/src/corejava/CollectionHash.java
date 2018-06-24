package corejava;

import java.util.Hashtable;

public class CollectionHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Hashtable<Integer,String> h=new Hashtable();
		h.put(1, "city");//integer is a key value in hashtable
		h.put(24, "ny");
		h.put(36, "sfo");
		//System.out.println(h.get(1));
		for(int i=1;i<h.size();i++)
		{
			System.out.println(h.get(i));
		}
		
	}

}
