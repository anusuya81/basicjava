package corejava;

public class Inheritance extends Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance input=new Inheritance();//call nonstatic fn/ you have to create object for subclass
		input.flower();
		System.out.println(input.z);//call nonstatic variable from Function method you have to create object
		country();
	    Age();
	    car("sedan");
	    int a=5;//if you want to change the value of the parameter you can assign like this
	    add(a,7);
	    massadd(a,5,10,55);
	   // food();you cann't call this method because it is private method in function class
	}
	//if you want to override the method from the superclass you can do like this
	public static void country()
	{
		System.out.println("i am from ny");
	}


}
