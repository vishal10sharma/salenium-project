package abstraction;

abstract class employee {
	
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	
	public abstract void calculate_balance_leaves();
	
	public abstract void avail_leave(int no_of_leaves,char type_of_leave);
	
	
	public abstract void calculate_salary();

}
 
	

	
	
	
	
