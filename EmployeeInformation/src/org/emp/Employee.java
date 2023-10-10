package org.emp;
import org.company.*;
import org.client.*;
import org.project.*;

public class Employee {
	public void empName(){
		System.out.println("Employee Name is Sam");
		}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.empName();
		Company n=new Company();
		n.companyName();
		Client c=new Client();
		c.clientName();
		Project p=new Project();
		p.projectName();

	}

}
