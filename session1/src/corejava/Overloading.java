package corejava;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	numbers(5);
	numbers(4.7);
	add(5,10);
	add(5,7,8);
	System.out.println(add(5,2,3,1));
	}
	public static int add(int a,int b,int c,int d)//this function has to return value,because its not void
	{
		return a+b+c+d;
	}
	
	public static void numbers(int a)
	{
		System.out.println(a);
	}
	public static void numbers(double a)
	{
		System.out.println(a);
	}
	public static void add(int a,int b)
	{
	int c=a+b;
	System.out.println(c);
	}
	public static void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

}
