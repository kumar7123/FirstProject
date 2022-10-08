package org.computer;

public class Computer extends Desktop {
private void computerModel() {
	System.out.println("DELL");
}
public static void main(String[] args) {
	Computer a=new Computer();
	a.computerModel();
	a.desktopSize();
	
}
}
