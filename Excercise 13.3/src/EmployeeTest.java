//Calvin LaClair - TestApp to add the salary, and print out the salary
//plus the names.

import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		
		Scanner S = new Scanner(System.in);
		System.out.println("What is their first name?");
		String fname = S.next();
		System.out.println("What is their last name?");
		String lname = S.next();
		System.out.println("What is their Salary?");
		double sal = S.nextDouble();
		Employee newEmployee = new Employee(fname,lname ,sal );
		
		Scanner S2 = new Scanner(System.in);
		System.out.println("What is their first name?");
		String fname2 = S.next();
		System.out.println("What is their last name?");
		String lname2 = S.next();
		System.out.println("What is their Salary?");
		double sal2 = S.nextDouble();
		Employee newEmployee2 = new Employee(fname2,lname2 ,sal2 );
		
		System.out.println("the yearly salary of "+newEmployee.getFirstName()+" "+newEmployee.getLastName()+" :");
		System.out.println(newEmployee.getMonthlySalary()*12);
		
		double newsalary= 
		newEmployee.getMonthlySalary()*0.1+newEmployee.getMonthlySalary();
		newEmployee.setMonthlySalary(newsalary);
		System.out.println("the new yearly salary of "+newEmployee.getFirstName()+" "+newEmployee.getLastName()+" :");
		System.out.println(newEmployee.getMonthlySalary()*12);
		newEmployee.getMonthlySalary();
		System.out.println("the yearly salary of "+newEmployee2.getFirstName()+" "+newEmployee2.getLastName()+" :");
		System.out.println(newEmployee2.getMonthlySalary()*12);
		
		double newsalary2= 
		newEmployee2.getMonthlySalary()*0.1+newEmployee2.getMonthlySalary();
		newEmployee2.setMonthlySalary(newsalary2);
		System.out.println("the new yearly salary of "+newEmployee2.getFirstName()+" "+newEmployee2.getLastName()+" :");
		System.out.println(newEmployee2.getMonthlySalary()*12);
		newEmployee2.getMonthlySalary();
	}
}