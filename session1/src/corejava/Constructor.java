package corejava;

//constructor is an instance method that usually has the same name as class
//and is used for assigning a new default value
//constructor should be always non static
//static keyword cannot be used as a constructor

public class Constructor {
	
	int age;
	int salary;
	static int house;
	String name;
	
	 Constructor()
	{
		 age=30;
		 salary=10000;
		 house=5;
		this.name="john";
		System.out.println(age);
		System.out.println(salary);
		System.out.println(house);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Constructor x=new Constructor( );
	System.out.println(x.age);
	
	}
	
	

}
