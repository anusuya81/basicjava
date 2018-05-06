package corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for string
		Scanner reader=new Scanner(System.in);
		System.out.println("what is your name");
		String name=reader.next();
		System.out.println("your name is "+name);

		//for integer
		Scanner reader1=new Scanner(System.in);
		System.out.println("how old are you");
		int age=reader1.nextInt();
		System.out.println("your age is "+age);
	}

}
