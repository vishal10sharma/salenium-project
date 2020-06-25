package abstraction;

import java.util.Scanner;

public class PermanentEmp extends employee {
	
	int paid_leave=10, sick_leave=10,casual_leave=10,balance_leaves;
	double basic, hra,pf;
	Scanner sca= new Scanner(System.in);
	public  void print_leave_details()
	{
		System.out.println("Total Paid leaves=  "+paid_leave);
		System.out.println("Total Sick leaves=  "+sick_leave);
		System.out.println("Total Casual leaves= "+casual_leave);
		
	}
	
	

	public static void main(String[] args) {
		PermanentEmp obj=new PermanentEmp();
		obj.print_leave_details();
		obj.avail_leave(5,'c');
		
	}


	@Override
	public void calculate_balance_leaves() {
		
		
		
	}


	@Override
	public void avail_leave(int no_of_leaves, char type_of_leave) {
		
//		System.out.println("Enter number of leaves ");
//		no_of_leaves=sca.nextInt(); 
		
//		System.out.println(" which type of leaves ");
//		System.out.println("enter:-> Paid leave=p ");
//		System.out.println("enter:-> sick leave=s ");
//		System.out.println("enter:-> casual leave=c ");
		
//		type_of_leave=sca.next().charAt(0);
		
		switch(type_of_leave)
		{
		case 'p':{
			balance_leaves=paid_leave-no_of_leaves;
			System.out.println("balance of paid leaves are  "+balance_leaves);
		}
		case 's':
		{
			
			balance_leaves=sick_leave-no_of_leaves;
			System.out.println("balance of sick leaves are  "+balance_leaves);
		}
		case 'c':
		{
			balance_leaves=casual_leave-no_of_leaves;
			System.out.println("balance of casual leaves are  "+balance_leaves);
		}
		
		
		
		}
		
		
	}


	@Override
	public void calculate_salary() {
		// TODO Auto-generated method stub
		
	}

}
