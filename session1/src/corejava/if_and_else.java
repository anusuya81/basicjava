package corejava;

public class if_and_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=300;
		int j=200;
		int a =300;
		// operators in java <,>,==,<=,>=,!
		if (i<j)
			System.out.println("i is less than j");
		else
			System.out.println("i is not less than j");
		
		if (i<=a)
			System.out.println("i is less than a");
		else
			System.out.println("i is not less than a ");
		//if you are comparing to variable you need to use ==
		if (i==a)
			System.out.println("i is equal to a");
		else
			System.out.println("i is not equal to a ");
		//without else also you can write if statements
		//if (j>a)
		//	System.out.println("j is greater than a");
		
		//coding standard
		if (j>a)
		{
			System.out.println("j is greater than a");
		}
		else
		{
			System.out.println("j is not greater than a");
		}
	
		if (!(i==a))//not equal example
		{
			System.out.println("value of i and a are not equal");
		}
		else
		{
			System.out.println("value of i and a are equal");
		}
		
		String name="john";
		String name1="michael";
		if (name == name1)
		{
			System.out.println("both of the names are same");
		}
		else
		{
			System.out.println("both of the names are not same");
		}
		
		
		}
			
		
		
		
	}
	
	
	


