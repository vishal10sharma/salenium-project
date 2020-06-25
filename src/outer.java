
public class outer {

	private void value()
	{
	 int a=20;
		
		//local inner class inside the method
		
		class inner
		{
			public int sum;
			public int b=20;
			
			
			public inner()
			//method of inner class
			{
				sum=a+b;			
			}
			private int getSum()
			{
				return sum;
			}
			
			
		} 
		
		inner inner=new inner();
	System.out.println("sum of a and b is:-> "+inner.getSum());
		//object created of inner class
	}
	public static void main(String[] args) {
		outer outer= new outer();
		outer.value();
		
	}
}
 