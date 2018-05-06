package corejava;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		int n=20;
		try
		{
			int fraction =n/d;
			System.out.println("end of main " + fraction);
		}
		catch(ArithmeticException e)//catch(Exception e)handles any kind of exception
		{
			System.out.println("you cannot divide by zero");
		}
		finally
		{
			System.out.println("Thanks for using this program");
		}
	}


}
