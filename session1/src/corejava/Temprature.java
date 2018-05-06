package corejava;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[]=new int[7];
i[0]=50;
i[1]=34;
i[2]=40;
i[3]=60;
i[4]=75;
i[5]=40;
i[6]=45;
String[] day= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

int a=0;
for (int x=0;x<i.length;x++)
{
	
if (a<i.length)
{
System.out.println(day[a]+" temprature is "+i[x]);
a++;
}
	//System.out.println(i[x]);
}
	}

}
