package day1;

public class ArmstrongNumber {
	 public static void main(String [] args )
	  {
		  for(int input=100;input<999;input++)
		  {
			  int temp=input;
			  int sum=0;int rem=0;
			  while(temp>0)
			  {
				  rem=temp%10;
				  sum=sum+(rem*rem*rem);
				  temp=temp/10;
				 
			  }
			  if(input==sum)
			  {
				  System.out.println(input + "is Armstrong number");
			  }
		  }
	  }



}
