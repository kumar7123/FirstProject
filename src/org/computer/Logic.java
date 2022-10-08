package org.computer;

import java.util.Scanner;

public class Logic {
public static void main(String[] args) {
	int a;
	Scanner in= new Scanner(System.in);
	a=in.nextInt();
			int b=0;
			int count=0;
			while (a>0) {
				count++;
				int num=a%10;
				b=b+num;
			
				a/=10;
				
				
			}
			b=b/count;
			System.out.println(b);	
			}
}

