package corejava;

import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v= new Vector();
		v.addElement(12);
		v.addElement(34);
		v.addElement(23);
		v.addElement(78);
		//System.out.println(v.elementAt(3));
		for(int i=0;i<v.size();i++)
		{
			//System.out.println(v.elementAt(i));
			System.out.println(v.get(i));
		}
	}

}
