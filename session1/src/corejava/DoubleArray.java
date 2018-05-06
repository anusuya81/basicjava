package corejava;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 String[][] flights={
		 {"Dallas","NYC","Miami", "chicago",
		  "New mexico","San Diego","DC","Newark",
          "Orlando","Baston","Kansas","Toronto",
          "Denver","Los Angels","Las Vegas","SFO"
		 }
 };
 
/*String flights[][]=new String[4][4];
//first row
flights[0][0]="Dallas";
flights[0][1]="NYC";
flights[0][2]="Miami";
flights[0][3]="Chicago";

//second row
flights[1][0]="New Mexico";
flights[1][1]="San Diego";
flights[1][2]="DC";
flights[1][3]="Newark";

//third row
flights[2][0]="Orlando";
flights[2][1]="Baston";
flights[2][2]="Kansas";
flights[2][3]="Toronto";

//4th row
flights[3][0]="Denver";
flights[3][1]="Los Angels";
flights[3][2]="Las Vegas";
flights[3][3]="SFO";

int rows = flights.length;
int cols = flights[0].length;


//argument for rows ; other way to do
for (int rownum=0;rownum<rows;rownum++)
{
	//argument for column
	for(int colnum=0;colnum<cols;colnum++)
	{
		System.out.println(flights[rownum][colnum]);
	}
}
*/
 
for (int rownum=0;rownum<flights.length;rownum++)
{
	//argument for column
	for(int colnum=0;colnum<flights[rownum].length;colnum++)
	{
		System.out.println(flights[rownum][colnum]);
	}
}
	}

}
