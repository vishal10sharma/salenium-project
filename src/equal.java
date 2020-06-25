import java.util.Scanner;
public class equal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n=s.nextInt();
		int []are=new int[n];
		
		System.out.println("enter the values of array   ");		
		for(int i=0; i<are.length;i++)
		{
			
		are[i]=s.nextInt();
		
		}
		
		for(int i=0;i<are.length;i++)
		{
			
		if(are[i]==are[i+1])
		{
		System.out.println("duplicate entery  "+are[1]);	
		}
	
		}
	}
}