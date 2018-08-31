package day1;

import java.util.Scanner;

public class String {
	public static void main(String [] args ) {
		//TODO Auto-generated method stud
		String input ="A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.";
	    String[] sent=input.split("\\s+");
	    Scanner sc =new Scanner(System.in);
	    Scanner position =new Scanner(System.in); 
	     remove=sc.nextLine();
	    int pos=position.nextInt();
	    sc.close();
	    position.close();
	    for(int i=0;i<sent.length;i++) {
	    	if(i==pos-1) {
	    		continue;
	    	}
	    	System.out.print(sent[i]+" ");
	    }
	}

}
