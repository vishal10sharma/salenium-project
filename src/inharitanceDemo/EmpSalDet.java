package inharitanceDemo;

public class EmpSalDet extends EmployeeDemo {
	int sal;
	
	public void acc()
	{
		acceptdetails();
		
		System.out.println("Enter salary");
		sal=s.nextInt();
		System.out.println();
		disp();
		System.out.println("the salary is  '"+sal+"'");
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpSalDet oo=new EmpSalDet();
		oo.acc();
		

	}

}
