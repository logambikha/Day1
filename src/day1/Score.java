package day1;

import java.util.Scanner;

public class Score {
	public static void main(String [] args )
    {
    	Scanner in=new Scanner(System.in);
    	int english,science,maths;
    	english=in.nextInt();
    	science=in.nextInt();
    	maths=in.nextInt();
    	in.close();
    	if(english>=60 && science>=60 && maths>=60)
    		System.out.println("pass");
		else if((english>=60 && science>=60)||(science>=60 && maths>=60)||(maths>=60 && english>=60))
				System.out.println("promoted");
		else
			System.out.println("fail");
			



    }

}
