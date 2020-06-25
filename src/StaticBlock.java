
public class StaticBlock {
	static int a=10,b=20,c;
static
{
	c=a+b;
	System.out.println("This is static block"+c);
	disp();
}
public static void disp()
{
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticBlock oo=new StaticBlock();
		//oo.disp();
	}

}
