package org.computer;

import java.util.Arrays;

public class Arra {
	
	public static void main(String[] args) {
		int[] a= {1,2,9,4,5,8,7};
		for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if (a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
					a[j]=temp;
					
					
				}
			
			
			}
				
		}
		int n=a.length;
		int i = 0, j = n-1;
        while (i < j) {
            System.out.print(a[j--] + " ");
            System.out.print(a[i++] + " ");
        }
      
		
		
	
	
	
			

if (n % 2 != 0) {
    System.out.print(a[i]);
}

		}

}
		


	

	
	
		
	

	
		
	


