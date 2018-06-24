package corejava;

public class NonStatic {
int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic x=new NonStatic();//we made instance(x) of the object(NonStatic())
		x.car();//x is a object for the class nonstatic
		//x.flower();
//System.out.println("hello");
	}

	public void car()//non static fn
	{
	//NonStatic y=new NonStatic();
	//y.flower();
	flower();
	System.out.println("Toyato");
	//System.out.println(a);non static variable you can call normally in nonstaic method 
	}
	
	public void flower()//non static fn
	{
	System.out.println("I like Rose");
	}
	

}
