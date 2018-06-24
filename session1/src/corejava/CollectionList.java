package corejava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> listOne=new ArrayList(Arrays.asList("a","b","c","d","e","f","g"));
		Collection<String> listTwo=new ArrayList(Arrays.asList("a","b","c","d","e","f","gg","h"));
		
		ArrayList<String> sourceList=new ArrayList<String>(listOne);
		ArrayList<String> destinationList=new ArrayList<String>(listTwo);
		
		sourceList.removeAll(listTwo);
		destinationList.removeAll(listOne);
		
		System.out.println(sourceList);
		System.out.println(destinationList);


	}

}
