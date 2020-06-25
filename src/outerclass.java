 class outerclas {

	int a=10;
	static int b=20;
	
	
	
	static class innerclass
	{
		static void m1()
		{
			
			System.out.println("inner class value of m1");
			//System.out.println("inner class value of a"+x.a);
			System.out.println("inner class value of b "+b);

			
		}
		void m2()
		{
			System.out.println("inner class value of m2");
			//System.out.println("inner class value of a"+x.a);
			System.out.println("inner class value of b"+b);
			
		}
		
	}
	
	innerclass obj=new innerclass();
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclas obj1=new outerclas();
		obj1.obj.m1();
		obj1.obj.m2();
		
	}

}
