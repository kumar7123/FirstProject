package org.emp;
import org.company.*;
import org.client.*;
import org.project.*;

public class Employee {
private void empName() {
	System.out.println("ramesh");
}
public static void main(String[] args) {
	Employee a=new Employee();
 	Company b=new Company();
 	Client c=new Client();
 	Project d=new Project();
 	a.empName();
 	b.companyName();
 	c.clientName();
 	d.projectName();
}
}
