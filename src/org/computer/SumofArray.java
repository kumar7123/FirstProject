package org.computer;

public class SumofArray {
	public static void main(String[] args) {
//		int[] a= {1,3,2,6,7,9,4};
//		int sum=0;
//		for (int i = 0; i < a.length-1; i++){
//			if (a[i]%2!=0) {
//				sum=sum+a[i];	
//			}
//			
//		
//		}
//		System.out.println(sum);
  String s="Welcometojava";
  String s1="";
 char[] s2 = s.toCharArray();
 for (int i = s2.length-1; i>=0; i--) {
	char c = s.charAt(i);
	s1=s1+c;
}
 System.out.println(s1);
 
		
	}
	}
	
	
	


