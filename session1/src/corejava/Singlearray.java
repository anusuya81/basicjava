package corejava;

public class Singlearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String rainbow[]=new String[7];
 
 rainbow[0]="red";
 rainbow[1]="blue";
 rainbow[2]="green";
 rainbow[3]="yellow";
 rainbow[4]="orange";
 rainbow[5]="violet";
 rainbow[6]="indigo";

 
//String[] rainbow= {"red","blue","green","yellow","orange","violet","indigo"};
for (int x=0;x<rainbow.length;x++)
{
	System.out.println(rainbow[x]);
}


	}
}
