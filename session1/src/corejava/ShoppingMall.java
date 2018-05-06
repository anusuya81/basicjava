package corejava;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     category();
		
	}
	
	public static void category()
	{
		System.out.println("what is the category you are looking for");
		Scanner reader=new Scanner(System.in);
		String name=reader.next();	
		
		
	
	
		System.out.println("what is the type you are looking for");
		Scanner reader1=new Scanner(System.in);
		int type=reader1.nextInt();
	
	if (name.equalsIgnoreCase("shoe") )
	{
		
		
		switch(type)
		{
		case 1: 
			System.out.println("you are looking for Kids shoe" );
			double price = 20;
			double pricetax = price + (price*.0825);
			System.out.println("kids shoe price with tax is "+ pricetax);
			break;
		case 2:
			System.out.println("you are looking for Men shoe" );
			double price1 = 39.5;
			System.out.println("Men shoe price with tax " +(price1+(price1*0.0825)));
			break;
		case 3:
			System.out.println("you are looking for Ladies shoe" );
			double price2 = 35.45;
			System.out.println("Women shoe price with tax " +(price2+(price2*0.0825)));
			break;
		default:
			System.out.println("what your looking for is not available");
			break;
				
		}
	 }
	else if(name.equalsIgnoreCase("dress"))
	{
		
		
		switch(type)
		{
		case 1: 
			System.out.println("you are looking for Kids Dress" );
			double price = 22.25;
			double pricetax = price + (price*.0825);
			System.out.println("kids dress price with tax is "+ pricetax);
			break;
		case 2:
			System.out.println("you are looking for Men Dress" );
			double price1 = 41.5;
			System.out.println("Men Dress price with tax " +(price1+(price1*0.0825)));
			break;
		case 3:
			System.out.println("you are looking for Ladies Dress" );
			double price2 = 37.45;
			System.out.println("Women Dress price with tax " +(price2+(price2*0.0825)));
			break;
		default:
			System.out.println("what your looking for is not available");
			break;
				
		}	
		
	}
	else
	{
		System.out.println("what your looking for is not available");
	}
			
		
		
	}

}
