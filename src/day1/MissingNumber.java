package day1;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		 int arr[] = new int[n]; 
		 
		for(int i=0; i< n; i++) {
			arr[i] = in.nextInt();
		}

		 in.close();
		
//		for(int i=0; i< n; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int lar = arr[0];
//		for(int i=1;i<n;i++) {
//			if(lar < arr[i]) {
//				lar = arr[i];
//				System.out.println(lar);
//			}
//		}
		
//		for(int i=0; i<n;i++) {
//			int lar1 = lar;
//			for(int i=0; i<lar1; i++) {
//				if(arr[i] != i) {
//					
//				}
//			}
//		}
		
		for (int i = 0; i < n-1; i++)    {   
		       // Last i elements are already in place   
		       for (int j = 0; j < n-i-1; j++) { 
		           if (arr[j] > arr[j+1]) {
		        	   int temp = arr[j];
		        	   arr[j] = arr[j+1];
		        	   arr[j+1] = temp;
		           }
		       }
		}
		 // arr[n+1] = 0;
		

		int a[] = new int[n+1];
		for(int i=0; i<n+1; i++) {
			a[i] = i;
		}
		

		

		for(int i=0; i< n+1; i++) {
			if(arr[i] != a[i]) {
				System.out.println(a[i]);
				break;
			}
		}
		
		
		
		

	}

}
