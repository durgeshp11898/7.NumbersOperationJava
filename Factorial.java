import java.util.*;

class Factorial
{
	public static void main(String args[])
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to find fact   :");
		int no=sc.nextInt();

		while(no!=0)
		{
			fact=fact*no;
			no=no-1;
		}
		System.out.println("Factorial is  :"+fact);
	}
}
		
