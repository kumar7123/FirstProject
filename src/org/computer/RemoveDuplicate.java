package org.computer;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s="welcometojava";
		//String s2="";
		//char[] s1 = s.toCharArray();
		//StringBuilder s4=new StringBuilder();
		Set<Character> s3=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			//char ch = s.charAt(i);
		//s2=s2+ch;
		s3.add(s.charAt(i));
		
		
		}
	
		
		for (Character i1 :s3) {
		//s4.append(i1);
		System.out.print(i1);
			
		}
		//System.out.println(s4);
		
		
	}
	
	

}
