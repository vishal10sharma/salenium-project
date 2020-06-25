import java.util.Scanner;

public class minimumnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []are;
		int min;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n=s.nextInt();
		are=new int[n];
		
		System.out.println("enter the values of array   ");		
		for(int i=0; i<are.length;i++)
		{
			
		are[i]=s.nextInt();
		
		}
		min=are[0];
		for(int i=1;i<are.length;i++) 
			{
				if(are[i]<min)
				{
					min=are[i];
				}
				
			}
			
		System.out.println("the min number is  "+min);
			
			
		
		

	}

}
