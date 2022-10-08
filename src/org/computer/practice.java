package org.computer;

public class practice {
	public static void main(String[] args) {
//		String s="JAVA123";
//		String s2="";
//		//int num=0;
//		//char[] s1 = s.toCharArray();
//		for (int i =0; i<s.length(); i++) {
//			char c = s.charAt(i);
//			if (!(Character.isDigit(c))){
//				
//				s2=s2+c;
//				
//			}
//			
//			
//			
//		}
//		System.out.println(s2);
//		int num=10;
//		if(!(num%2==0)) {
//			System.out.println("odd num");
//		}else {
//			System.out.println("even number");
		String s="Hello Java";
		String s1="";
	
	//String[] s2 = s.split(" ");
	//System.out.println(s2);
//	for (int i = s.length()-1; i>=0; i--) {
//		char c = s.charAt(i);
//		s1=s1+c;
//	
//	
//	//}
//		
//		}
//	
//	System.out.println(s1);	
		String[] s2 = s.split(" ");
		for (String x : s2) {
		for (int i =x.length()-1; i>=0; i--) {
			char c = x.charAt(i);
			s1=s1+c;
		
			
		}
			
		}
		System.out.println(s1);
		
}
}	


