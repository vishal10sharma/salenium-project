
public class cunstructordemo {

	int num1, num2, res;
	public cunstructordemo() {
		
		num1=100;
		num2=200;
	}
	public void sum()
	{
		
		res=num1+num2;
		System.out.println(res);
		
	}
	public static void main(String []args) {
		// TODO Auto-generated method stub
cunstructordemo obj = new cunstructordemo();
obj.sum();

	}

}
