package corejava;

public class break_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=5;
		switch (age)
		{
		case 1:
			System.out.println("you can crawl");
			break;
			
		case 2:
			System.out.println("you can talk");
			break;
		case 3:
			System.out.println("you can walk");
			break;
		case 4:
			System.out.println("you can run");
			break;
		case 5:
			System.out.println("you can sing");
			break;
		default:
			System.out.println("i do not know your age");
				
		}
		if (age==5)
		{
			System.out.println("i can go to school");
		}
	}

}
