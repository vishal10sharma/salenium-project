import java.util.Scanner;

public class maximumarray {

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
		int max=are[0];
		for(int i=1;i<are.length;i++) {
			{
				if(are[i]>max)
				{
					max=are[i];
				}
			}
			
			
			
			
		}
		System.out.println("the maximum number is  "+max);
	}

}
