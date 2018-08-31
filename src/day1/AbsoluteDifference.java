package day1;

import java.util.Scanner;

public class AbsoluteDifference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		in.close();
		int[] arr= {10,20,30,10,40,50};
		boolean ans=false;
		int posi=0,posj=0;
		int k=arr[0];
		for(int i=0;i<6;i++)
		{
			
			if(k==arr[i]) 
			{ 
				ans=true; 
				posi=i; 
				posj=i+1; 
				break;
			}
			 k=arr[i];
			
		}
    if(ans)
    {
    	if(((posi-posj)*-1)<k) System.out.println("Success");
    	else System.out.println("Fail");
    }

	}

}



