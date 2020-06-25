package inharitanceDemo;

public interface EmpQualDet {
 int id=10;
	void QualDet();
	void dispQual();
	
	static void demostatic()//concrete method
	{
		System.out.println("Id is "+id);
		System.out.println("Demo Static");
		
		
	}
	
	default void demodefault()//concrete method
	{
		
		System.out.println("demo default");
	}
	
	
}
