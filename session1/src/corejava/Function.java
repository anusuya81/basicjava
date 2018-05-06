package corejava;

public class Function extends NonStatic {
	static int t=5;//global variable under the class and you have to mention static because all methods are static
	int z=10;//nonstatic variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    country();
    //state();
    Age();
    car("sedan");
    add(5,7);
    massadd(1,5,t,55);
    food();
    Function l=new Function();
    System.out.println(l.z);
	}
	//functions
	private static void food()
	{
		System.out.println("i love fruits");
	}
	public static void country()
	{
	state();
		System.out.println("I am from Mars");
		//Function l=new Function();
	    //System.out.println(l.z);
	}
	public static void state()
	{
		System.out.println("I am from Texas");
	}
	public static void Age()
	{
		int a=10;
		System.out.println("My age is " +a);
	}
	public static void car(String name)
	{
		System.out.println(name);
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void massadd(int a,int b,int t,int d)
	{
		int e=a+b+t+d;
		System.out.println(e);
		System.out.println(t);
	}
	

}
