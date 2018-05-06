package corejava;
//when you have an abstract method in any class,it becomes an abstract class
//abstract method means you know your fn/,but don't know the action of that fn/

public abstract class Abstract {
	
	public static void color() {
		System.out.println("blue is my favorite color");
	}
	public static void food()
	{
		System.out.println("i like food");
	}
	public static void addition(int a,int b)
	{
		int add=a+b;
		System.out.println(add);
	}
	public abstract void dinner();
	
		
	

}
