package corejava;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double height = 70;
		 double weight = 140;
    double bmi;
    bmi = (weight*703/(height*height));
    String bmiString;
   /* switch (bmi)
   {
   case 18:
   	System.out.println("underweight"); 
   	break;
   case 25:
   	System.out.println("overweight");
  		break;
   case 30:
   	System.out.println("obesity");
   		break;
      }*/
 if ( bmi< 18)
 {
	 bmiString = "underweight";
	 //System.out.println("underweight");  
 }
 else if((bmi >25) && (bmi<30))
 {
	 bmiString = "overweight";
	 //System.out.println("overweight");
 }
 else if(bmi >=30)
 {
	 bmiString = "obesity";
	 //System.out.println("obesity"); 
 }
 else
 {
	 bmiString = "normalweight";
	 //System.out.println("normalweight");
 }
 System.out.println("bmi="+bmi);	 
 System.out.println(bmiString);
  	
	}

}
