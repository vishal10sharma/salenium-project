package inharitanceDemo;

import java.util.Scanner;

public class Employee implements EmpPersonalDet,EmpQualDet  {

	int EmpId;
	String name;
	Scanner s=new Scanner(System.in);
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void QualDet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispQual() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterdet() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Employee Id ");
		EmpId=s.nextInt();
		System.out.println("Enter name ");
		name=s.next();
		
		
	}

	@Override
	public void dispdet() {
		// TODO Auto-generated method stub
		
		System.out.println("Id is  "+EmpId);
		System.out.println("Name is "+name);
		
		
	}

}
