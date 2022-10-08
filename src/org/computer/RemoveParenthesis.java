package org.computer;

public class RemoveParenthesis {
	public static void main(String[] args) {
		String s="((abc)((de))";
		//String open="";
		//String close="";
		String removed="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='('||c==')') {
				continue;
				
				
			}else {
				removed=removed+c;
			}
			
			
		}
		System.out.println(removed);
		
		}
	}
	
	
	


