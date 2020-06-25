package inharitanceDemo;

import java.util.Scanner;

public class EmployeeDemo {

	int emplid;
	String name;
	long contact_no;
	Scanner s=new Scanner(System.in);
	
	public void acceptdetails()
	{
		System.out.println("Enter the Employee Id");
		emplid=s.nextInt();
		
		System.out.println("Enter name ");
		name=s.next();
		
		System.out.println("Enter contact no ");
		contact_no=s.nextLong();
		
		
		
		
	}
	
	public void disp()
	{
		System.out.println("Employe id is '"+emplid+"'");
		System.out.println("Name is '"+name+"'");
		System.out.println("Contact number is '"+contact_no+"'");
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
